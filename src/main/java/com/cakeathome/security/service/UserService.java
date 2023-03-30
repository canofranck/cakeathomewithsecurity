package com.cakeathome.security.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cakeathome.security.entity.User;
import com.cakeathome.security.exception.domain.EmailExistException;
import com.cakeathome.security.exception.domain.EmailNotFoundException;
import com.cakeathome.security.exception.domain.NotAnImageFileException;
import com.cakeathome.security.exception.domain.UserNotFoundException;
import com.cakeathome.security.exception.domain.UsernameExistException;

import jakarta.mail.MessagingException;


public interface UserService {

	User register(String firstname, String lastname, String username, String email, String password) throws UserNotFoundException, UsernameExistException, EmailExistException;

	User findUserByEmail(String email);

	User findUserByUsername(String username);
	
	User updateProfileImage(String username, MultipartFile profileImage) throws NotAnImageFileException, IOException, UserNotFoundException, UsernameExistException, EmailExistException;

	User addNewUser(String firstname, String lastname, String username, String email,String password ,String role, boolean isActive, 
			boolean isNonLocked, MultipartFile profileImage) throws NotAnImageFileException, IOException, UserNotFoundException, UsernameExistException, EmailExistException;
	
	User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername,
			String newEmail, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) 
			throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;

	List<User> getUsers();

	void deleteUser(long id);

	void resetPassword(String email) throws EmailNotFoundException, MessagingException;	
}