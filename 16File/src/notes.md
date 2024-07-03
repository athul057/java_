## File operations in Java

#### To create a File in java.
```java
 private static File createFile(String path){
        try {
            File file=new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            return file;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
```
to delete a file we can **file.delete()**

Now a new file will create with the path name `path`
##### To write into a file in java


```java
private  static void writetoFile(File file){
        try{
            FileWriter fileWriter=new FileWriter(file,true);
            PrintWriter writer=new PrintWriter(fileWriter);
            writer.println("hello");
            writer.println("world");
            writer.flush();
            writer.close();

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
```

if we want to append into our newly create file 
`FileWriter fileWriter=new FileWriter(file,true);`
add true here 
if we don't want to append into our file
`FileWriter fileWriter=new FileWriter(file)`
Now append operation won't work.


##### Read from a file
```java

        try {
            Scanner scanner=new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
```
We can read our file by using `Scanner` class.


