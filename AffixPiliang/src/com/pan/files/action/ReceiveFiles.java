package com.pan.files.action;

import java.io.File;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class ReceiveFiles {
		private static final long serialVersionUID = 1L;

		private File  files; 			// �û��ϴ����ļ� �����������ǰ̨�ؼ���nameһ��
		private String filesFileName; 	// �ϴ��ļ����ļ���
		private String filesContentType;	// �ϴ��ļ�������
		private String   filesDescription;	// �û�������
	
		
		public void execute(){
		File sPath = this.getFiles();
			
		
		}
		
		public File getFiles() {
			return files;
		}

		public void setFiles(File files) {
			this.files = files;
		}

		public String getFilesFileName() {
			return filesFileName;
		}

		public void setFilesFileName(String filesFileName) {
			this.filesFileName = filesFileName;
		}

		public String getFilesContentType() {
			return filesContentType;
		}

		public void setFilesContentType(String filesContentType) {
			this.filesContentType = filesContentType;
		}

		public String getFilesDescription() {
			return filesDescription;
		}

		public void setFilesDescription(String filesDescription) {
			this.filesDescription = filesDescription;
		}
		
	
}
