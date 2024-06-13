## enum actions


````java
enum colors{
red,green,blue,yellow,white
}

Arrays.toString(colors.values())
````
through this we can get the values in enum as arrays 

`[red,green,blue,yellow,white]`



We can iterate those values using for loop 


````java
for(colors color:colors.values()){
            System.out.println(color);
        }
````
here we are using for each loop to iterate through the values.