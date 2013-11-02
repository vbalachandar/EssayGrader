                                                                   
                                                                     
                                                                     
                                            
project 1 for CS421 - University of Illinois at Chicago

-------------------------------------------------------------------------
--->SETUP<---------------------------------------------------------------

Here you should describe how to run your program. Imagine someone (me)
downloads your archive file on a computer and needs step by step
instructions to make everything work. Make sure to specify the relative
positions of files and folders, if needed.

1) Since we employ both Stanford POSTagger and Parser, please download their respective jar files
(stanford-postagger.jar,stanford-parser.jar,stanford-2.0.4-models.jar)
2) Create a new Java Project in Eclipse and add the above jar files.
3)Include  the Java file(source code)  into the project
4) Download the java source code(Egrader.java)
5)Create a new java package in Eclipse.A new folder will be created in the filesystem corresponding to this package.
  Make sure the folder is present in th same location as the source code file.
6) Download the other files(subvberr.java,vberr.java,worder.java) into the folder created in the previous step.



-------------------------------------------------------------------------
--->INPUT<---------------------------------------------------------------
	
Use this section only if your program requires some arguments as input.

1) Our program accepts two arguments as input.
2) The first argument denotes the location of the model and the second one mentions the location of the test input file.
3) Provide the argunments <location of model><space><location of test file> .
4) The arguments can be given in Eclipse IDE by Run->Run Congifuration->Arguments
-------------------------------------------------------------------------
--->OUTPUT<--------------------------------------------------------------

In this section you must specify what your program writes in the
standard or file output. 

1) Grades for each  of the criteria of the essay and also presented as a matrix.

sample input:
16th file of the essay corpus.




sample output :

Printing the final grade array.............................
1a	1b	1c	1d	2a	2b	3a
1	1	1	1	1	1	1	
1	1	1	1	1	1	1	
1	0	1	1	1	1	1	
0	0	0	1	1	1	1	
0	0	0	1	1	1	1	
1	0	0	1	1	1	1	
1	1	1	1	1	1	1

	
(1a)Word Order Score of the Essay is      :3
(1b)Subject Verb Score of the Essay is    :3
(1c)Verb Tense Score of the Essay is      :2
(3a)Sentence Length Score of the Essay is :5


(Note : The no.of rows in the matrix is equal to no.of sentences. Each sentence has a score according to the criteria. '1' denotes a sentence does not have an error

and '0' denotes an error.)


-------------------------------------------------------------------------
--->FILES<---------------------------------------------------------------

This sections must include a description of any file your program reads
or writes. Include a description of where the file is located, how it
is formatted, and what its purpose is. Do not describe the files already
provided to you, such as the essays. Just describe the files you create,
if any.

1) Our program reads a test file which is passed as an argument to the program.	
2) We also create an intermediate text file. The test file may not be properly formatted. If the file is not formatted, it is difficult to count the number 
   of sentences . As a result it will be difficult to apply the grammar rules.
3) So we apply a series of rules to split the input file to properly formatted sentences and save it in an intermediate text file.
4) We use this file subsequently for the rest of the project.   

-------------------------------------------------------------------------
--->TECHNIQUE<-----------------------------------------------------------

A brief explanation of how you exploited POS tagging to evaluate the essays.
Also state some patterns of errors in terms of POS tags that you found.

1) We have predominantly maintained a series of rules that depict incorrect grammatical sentences.
2) These rules were error patterns written in terms of POS Tags.
3) We were able to capture the relationship between words like subject-verb agreeement by comparing the POS tags assigned
    to the input sentence with our rules.
4)  To an extent we could also deal with the word order with the help of POS tags.
5) We use the tags returned by the POS tagger and compare with our rules to validate the sentence.
6) Some error patterns in terms of POS tags are as follows :
       
	   Children/NNP is/VBZ doing/VBG well/RB ./.
        <NNP><VBZ> is a one of the error patterns of subject-verb disagreement.
      
       Children/NNP doing/VBG well/RB ./.	  
	   <NNP><VBG><RB>  This is one of the error patterns of missing verb
	   
   


-------------------------------------------------------------------------
--->TODO<----------------------------------------------------------------
	
Write here a short list of what you plan to do/fix for the second part of
the project.
  We haven't looked in detail  about the second part of the project. But still here some rough ideas :
1) We might have to look for constituent paterns returned by the parser to check for sentence well formedness.
2) Simple Coreference resolution techniques have to be used to check for coherence.
3) Have a lexicon for a particular topic and check if the essay sufficient no.of words inclined towards the topic .
