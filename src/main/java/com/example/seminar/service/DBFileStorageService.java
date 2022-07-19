package com.example.seminar.service;

import com.example.seminar.exception.FileStorageException;
import com.example.seminar.exception.MyFileNotFoundException;
import com.example.seminar.model.DBFile;
import com.example.seminar.model.User;
import com.example.seminar.repository.DBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class DBFileStorageService {

    @Autowired
    private DBFileRepository dbFileRepository;
   
    
    @Autowired
	private static List<DBFile> postList = new ArrayList<DBFile>();

    public DBFile storeFile(MultipartFile file, User user) {
        
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        

        try {
            
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes(), user);

            return dbFileRepository.save(dbFile);
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public DBFile getFile(String fileId) {
        return dbFileRepository.findById(fileId)
                .orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }
    
    public List < DBFile > findAll() {
        return dbFileRepository.findAll();
    }
    
    public void deleteById(String id) {
    	
    	dbFileRepository.deleteById(id);
    }
    
}
