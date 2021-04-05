# SimpleCalculator
 
Requirements
You must address the following in order for your assignment to be considered complete:

Depending on how you count, there are at least six bugs in the SimpleCalculator code. In an absolute sense, it's more, but in many cases if you find one of the bugs in my count of six, then you've probably discovered other similar bugs. Additionally, some bugs may not be apparent until you've fixed other bugs, so make sure you examine the app carefully at each stage. For your code to be considered 100% complete, you must fix at least four of these bugs (Note that grading for this component is captured by the 'Verification' category in the rubric).

For at least two distinct bugs: Finding bugs is an exploratory process, and since the app is 'working', you must find the edge cases that produce the bug. Once you have done so, you should use the four-step procedure outlined in Reading 11(https://ocw.mit.edu/ans7870/6/6.005/s16/classes/11-debugging/index.html): Debugging to identify the source of the bug and fix it. This process - including outlining your process for all four steps must be described in your README.md file, including:

Study the data: Outline the exploratory approach you've taken (by using the app) to find the bug.
Hypothesize: Write down what you think is happening *before* you actually attempt to solve the bug. This hypothesis should be consistent with the data from step 1.

Experiment: Breakpoints are your best option, but you can use Log statements too.
Repeat: If your hypothesis and experiments don't work, then revisit the data and try again. If you solve it on the first attempt then explain that here.

There are at least two areas of code that could benefit from the use of assertions. Consider the discussion of assertion (and What to Assert) in Reading 8(https://ocw.mit.edu/ans7870/6/6.005/s16/classes/08-avoiding-debugging/index.html): Avoiding Debugging and add assertion where you believe necessary. Note you may also want to consider the use of try...catch, if you are familiar with it.

After you have solved all bugs: Following the example BigInteger.multiply() in Reading 3(https://ocw.mit.edu/ans7870/6/6.005/s16/classes/03-testing/index.html): Testing write a similar analysis for the division operation in SimpleCalculator. Don't worry about using Java's BigInteger, but think about the type defined for division in SimpleCalculator, and consider the different categories of number that could be divided. Produce a grid similar to the one in Reading 3: Testing, and list some example tests (note that you can draw the grid by hand, if you like, then post an image in your README.md).