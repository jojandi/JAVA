package human.class1.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileController {

	@RequestMapping("/uploadForm")
	public String uploadForm() {
		return "uploadForm";
	}
	
	@RequestMapping("/upload")
	public String upload(MultipartHttpServletRequest req) {
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title : " + title);
		System.out.println("content : " + content);
		
		// 파일 처리 //
		MultipartFile mf = req.getFile("file1");
		// 파일 사이즈 구하기
		long fileSize = mf.getSize(); // byte 단위
		System.out.println("fileSize : " + fileSize);
		
		// 파일 이름 구하기
		String fileName = mf.getOriginalFilename();
		System.out.println("fileName : " + fileName);
		
		// 파일 저장
		try {
			// 업로드 될 경로 지정
			String path = "C:\\temp\\upload";
			
			// DB에 저장할 파일 이름 지정
			String safeFileName = path + "\\" + System.currentTimeMillis() + "_" + fileName;
			System.out.println("safeFileName : " + safeFileName);
			File file = new File(safeFileName);
			
			mf.transferTo(file);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return "uploadForm";
	}
	
	@RequestMapping("/uploads")
	public String uploads(MultipartHttpServletRequest req) {
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title : " + title);
		System.out.println("content : " + content);
		
		// 파일 처리 //
		List<MultipartFile> mfList = req.getFiles("file1");
		
		for(MultipartFile mf : mfList) {
			
			// 파일 사이즈 구하기
			long fileSize = mf.getSize(); // byte 단위
			System.out.println("fileSize : " + fileSize);
			
			// 파일 이름 구하기
			String fileName = mf.getOriginalFilename();
			System.out.println("fileName : " + fileName);
			
			// 파일 저장
			try {
				// 업로드 될 경로 지정
				String path = "C:\\temp\\upload";
				
				// DB에 저장할 파일 이름 지정
				String safeFileName = path + "\\" + System.currentTimeMillis() + "_" + fileName;
				System.out.println("safeFileName : " + safeFileName);
				File file = new File(safeFileName);
				
				mf.transferTo(file);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		return "uploadForm";
	}
	
}
