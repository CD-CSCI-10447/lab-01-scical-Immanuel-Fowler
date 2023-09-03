# Beginner's Guide to Bash Commands on OSX

Welcome to the world of the command line! If you're using a Mac, you have a powerful tool at your fingertips known as the Terminal. Inside the Terminal, you'll use a language called "bash" to navigate and manage your files. Here's a quick guide to get you started.

## 1. Opening the Terminal
1. Go to Applications > Utilities > Terminal.
2. Open the Terminal application.

You'll see something like:

```
Your-MacBook-Pro:~ yourusername$
```

This is called the command prompt.

## 2. Basic Commands:

### `pwd` (Print Working Directory)
Tells you the current directory (folder) you are in.
```bash
$ pwd
```

### `ls` (List)
Shows the files and directories in the current directory.
```bash
$ ls
```

### `cd` (Change Directory)
Allows you to move between directories.
- To move into a directory called "Documents":
```bash
$ cd Documents
```
- To move up one directory:
```bash
$ cd ..
```
- To go back to your home directory:
```bash
$ cd
```
or
```bash
$ cd ~
```

### `mkdir` (Make Directory)
Creates a new directory.
```bash
$ mkdir NewDirectory
```

### `rmdir` (Remove Directory)
Removes an empty directory. If the directory has files, you'll need a different command.
```bash
$ rmdir DirectoryName
```

### `touch`
Creates an empty file.
```bash
$ touch newfile.txt
```

### `rm` (Remove)
Deletes files or directories.
- To delete a file:
```bash
$ rm filename.txt
```
- To delete a directory and its contents (be careful with this!):
```bash
$ rm -r DirectoryName
```

### `nano`
A simple text editor inside the terminal. 
```bash
$ nano filename.txt
```
After editing, press `CTRL + X` to close, then `Y` to save changes, and `Enter` to confirm.

## 3. Additional Tips:

1. **Autocomplete**: Press `Tab` after typing part of a filename or directory to autocomplete.
2. **Command History**: Press `Up Arrow` to see previous commands.
3. **Clear Screen**: Type `clear` to get a clean slate.

## 4. Validating the `dev` folder exists:

### Why Create a `~/dev` Folder on Your Mac?

1. **Stay Organized**: Think of the `~/dev` folder as a special drawer for your coding projects. Everything's in one place, making it easier to find.

2. **Keep Your Mac Fast**: Storing projects in `~/dev` instead of the desktop helps your Mac run smoother. The desktop can get bogged down with too many items.

3. **Easier Backups**: If you use backup tools, having all your code in `~/dev` makes it simpler to back up just your projects, or skip them if they're too large.

4. **Keep Work Separate**: A `~/dev` folder keeps your coding projects away from personal files, reducing mix-ups.

5. **Safer from Mistakes**: It's less likely you'll accidentally delete or change a project when it's in `~/dev` rather than mixed with other desktop files.

6. **Consistency with Others**: If you work in a team or learn coding from guides, many people use a `~/dev` setup. It's like speaking the same workspace language.

7. **Easier Moves**: If you want to transfer your projects to another computer, having them in `~/dev` makes this process simpler.

8. **Avoid Technical Glitches**: Some coding tools might get confused with spaces or unusual characters in folder names. The `~/dev` path is clear and straightforward.

9. **Better Privacy**: The `~/dev` folder is a bit more tucked away, adding an extra layer of privacy for your projects.

10. **Looks Professional**: If you ever share your screen, having a dedicated `~/dev` folder for your code projects appears more organized and professional.

In a nutshell, creating a `~/dev` folder on your Mac is like having a dedicated workspace for your coding projects. It keeps things tidy, safe, and efficient.

To check if you have a 'dev' folder in your home directory and to create one if it doesn't exist, follow these steps:

### 1. Open the Terminal

- Navigate to Applications > Utilities > Terminal to open the Terminal application.

### 2. Go to the Home Directory

Once in the Terminal, you should be in your home directory by default. If you're not sure or if you've navigated elsewhere, you can always return to the home directory by typing:

```bash
$ cd ~
```

Or simply:

```bash
$ cd
```

### 3. Check for the 'dev' Folder

To list all directories and files in the home directory, type:

```bash
$ ls
```

Look through the listed items to see if "dev" is among them. If you have many items, you can filter this list using:

```bash
$ ls | grep dev
```

If `dev` is present, it'll be shown in the Terminal's output. If nothing is returned from the above command, it means the 'dev' folder doesn't exist.

### 4. Create the 'dev' Folder (if it doesn't exist)

If you determined in step 3 that the 'dev' folder doesn't exist, you can create it using the following command:

```bash
$ mkdir dev
```

To double-check that it's been created, you can use the `ls` command again:

```bash
$ ls
```

You should now see `dev` listed among the directories and files in your home directory.

### 5. Conclusion

By following the above steps, you've ensured you have a 'dev' folder in your home directory. This folder can be a great place to store development projects, practice coding, or any other tech-related tasks.