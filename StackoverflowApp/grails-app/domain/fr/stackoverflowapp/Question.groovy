package fr.stackoverflowapp

class Question {

	String title
	String body
	Date askDate
	Date editDate
	int votesNumber
	int viewsNumber
	boolean blocked
	boolean _protected
	int flag
	
	static hasMany = [tags:Tags, answers: Answer]
	static belongsTo = [profile: Profile]
    
	static constraints = {
		
		title(blank: false, minSize: 10)
		body(blank: false, minSize: 10)
		
		
    }
	
	static mapping = {
		
		votesNumber defaultValue: 0
		viewsNumber defaultValue: 0
		blocked defaultValue: false
		_protected defaultValue: false
		flag defaultValue: 0
	}
}
