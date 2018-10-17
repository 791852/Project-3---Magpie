/**
 * Veronica Pratt
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        String trimmed = statement.trim(); //this creates a trimmed version of the statement that the chatter gives me
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        if(statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0){
            response = "Tell me more about your pets.";  
        }
        else if(statement.indexOf("Mr. Ettlin") >= 0){ //these are some of the responses I've created
            response = "He sounds great!"; //after checking to see if the string has the keyword, then this is the response the chatbot gives
        }
        else if(statement.indexOf("weather") >=0){
            response = "Great weather we've been having lately";
        }
        else if(statement.indexOf("book")>=0){
            response = "That's my favorite book!";
        }
        else if(statement.indexOf("movie")>=0){
            response = "I'm not a huge fan of movies";
        }
        else if(trimmed.length() < 1){ //this uses that trimmed string and checks to make sure the chatter has responded
            response = "Let's talk some more now";
        }
        else
        {
            response = getRandomResponse(); //this accesses the randomResponse method below, which returns a random response
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES); //this randomizes the responses you would get from the chatbot
        String response = ""; //this creates a response string for the chatbot
        if (whichResponse == 0) //these all return a noncommittal respones depending on the random number you get
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if(whichResponse == 4){
            response = "Maybe so...";
        }
        else if (whichResponse == 5){
            response = "Let's talk more on this point";
        }
        return response;
    }
}
