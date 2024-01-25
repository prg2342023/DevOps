node{
	stage('SCM Checkout'){
		git 'https://github.com/prg2342023/DevOps.git'
	}
	stage('Compile-Package'){
		//Get maven home path
		def mvnHome = tool name: 'maven-3', type: 'maven'
		sh "${mvnHome}/bin/mvn package"
	}
	stage('Email Notification'){
		mail bcc: '', body: 'hi, I am prakash gohil.', cc: '', from: 'pmgohil43@gmail.com', replyTo: 'pmgohil43@gmail.com', subject: 'Intro', to: 'prg2342023@sicsr.ac.in'
	}
}
