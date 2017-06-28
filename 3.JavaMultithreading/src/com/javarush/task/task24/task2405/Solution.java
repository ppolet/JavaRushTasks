package com.javarush.task.task24.task2405;

/* 
Black box
*/
public class Solution implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {
        FirstClass firstClass;
        SecondClass secondClass;

        public void someAction() {
            if (param > 0)
            {
                firstClass = new FirstClass()
                {
                    @Override
                    public Action getDependantAction()
                    {
                        return new Action()
                        {
                            @Override
                            public void someAction()
                            {
                            }
                        };
                    }
                };
                int limit = param;
                for (int i = 0; i < limit; i++)
                    System.out.println(param--);
                firstClass.someAction();
            }
            secondClass = new SecondClass();
            secondClass.someAction();
            System.out.print(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM);
            System.out.println(param);
        }
    };


    public Solution(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}