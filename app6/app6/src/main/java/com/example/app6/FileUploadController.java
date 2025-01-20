package com.example.app6;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {

		@RequestMapping("u1")
		public String upload1(@RequestParam MultipartFile file) throws Exception{
			FileOutputStream fout = new FileOutputStream(file.getOriginalFilename());
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			bout.write(file.getBytes());
			bout.flush();
			bout.close();
			return "file uploaded successfully project to see the same";
		}
		@RequestMapping("u2")
		public String upload2(@RequestParam MultipartFile file1,
				              @RequestParam MultipartFile abc,
				              @RequestParam String firstName,
				              @RequestParam Integer age) throws Exception{
			FileOutputStream fout = new FileOutputStream(file1.getOriginalFilename());
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			bout.write(file1.getBytes());
			bout.flush();
			bout.close();
			FileOutputStream fout2 = new FileOutputStream(file1.getOriginalFilename());
			BufferedOutputStream bout2 = new BufferedOutputStream(fout2);
			bout2.write(file1.getBytes());
			bout2.flush();
			bout2.close();
			System.out.println(firstName);
			System.out.println(age);
			
			return "file uploaded successfully project to see the same";
		}
}