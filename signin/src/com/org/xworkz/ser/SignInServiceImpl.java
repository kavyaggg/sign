package com.org.xworkz.ser;

import java.util.Objects;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.xworkz.dao.SignInDAO;
import com.org.xworkz.dto.SignInDTO;
import com.org.xworkz.entity.SignInEntity;
@Service
public class SignInServiceImpl implements SignInService {
	private static final String ConfirmPassword = null;
	@Autowired
	private SignInDAO signindao;
	public SignInServiceImpl () {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}

	public boolean validateAndSave(SignInDTO signindto) {
		boolean valid = false;
		try {
			System.out.println("save invoked " + signindto);

			if(Objects.nonNull(signindto)) {
				System.out.println("starting validation for " + signindto);
				String name = signindto.getName();
				if (name !=null && !name.isEmpty() && name.length() >=5) {
				System.out.println("name is valid");
				valid = true;
				} else {
					System.out.println("name is invalid");
					if(name == null) {
						System.out.println("name is null");
					}
					if(name !=null && name.length() <5) {
						System.out.println("name length is less than 5");
					}
					valid = false;
				}
		
				String email = signindto.getEmail();
				if (email !=null && !email.isEmpty() && email.length() >=5) {
					System.out.println("Email is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("Email is invalid");
					valid = false;
					
				}
			}
			
				String password = signindto.getPassword();
				if (password !=null && !password.isEmpty() && password.length() >=5) {
					System.out.println("Password is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("Password is invalid");
					valid = false;
					
				}
			}
			
				String confirmPassword = signindto.getConfirmpassword();
				if (confirmPassword !=null && !confirmPassword.isEmpty() && confirmPassword.length() >=5) {
					System.out.println("ConformPassword is valid");
					valid = true;	
			} else {
				if(valid) {
					System.out.println("ConformPassword is invalid");
					valid = false;
				}		
		}
			}
			//return valid;
			
				
			if(valid) {
				System.out.println("Data is valid ,will convert  to entity");
				
				SignInEntity signinentity = new SignInEntity();
				
				BeanUtils.copyProperties(signindto, signinentity);
				
				System.out.println("entity is ready \t "+ signinentity);
				signindao.save(signinentity);

			
			
		} 
			}
		
	catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

		


}
