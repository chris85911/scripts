<cfscript>
	fileObj = createObject( "java", "java.awt.Toolkit" );
	
    currentDate = dateFormat(now(), "yyyy-MM-dd");
    currentTime = timeFormat(now(), "HH:mm:ss");
    dashes = repeatString("-", 50);

    // Generate the output string with the current date, time, and dashes
    output = currentDate & " " & currentTime & chr(13) & chr(10) & dashes;

	stringSelect = createObject( "java", "java.awt.datatransfer.StringSelection" ).init(output);
	
	fileObj.getDefaultToolkit().getSystemClipboard().setContents( stringSelect, stringSelect );

    // Prompt the user to press the spacebar to end the program
    writeOutput("Output has been copied to the clipboard. Press the spacebar to end the program...");
</cfscript>