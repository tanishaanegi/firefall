# firefall

## 🔥 Fireball Dodge Game

A beginner-friendly 2D Java Swing game where the player moves horizontally to dodge falling enemies (fireballs) and reach the other side safely.

### 🎮 Features

- 🚶‍♂️ **Player Movement** – Control the character using left and right arrow keys
- 🔥 **Falling Enemies** – Three fireballs descend at different speeds and positions
- 🎯 **Collision Detection** – Game ends when the player collides with an enemy
- 🏁 **Victory Condition** – Game is won if the player reaches the right edge of the screen
- 🖼️ **Custom Graphics** – Uses a background image and custom player/enemy sprites
- ⏱️ **Game Loop** – Uses `javax.swing.Timer` to repaint and update game state
- 🎨 **Java Swing UI** – Built entirely using Java's Swing framework
- ❌ **No Restart Feature** – The game ends on collision or success and must be manually restarted

### 🛠️ Tech Stack

- **Language:** Java  
- **GUI Toolkit:** Java Swing  
- **IDE:** Eclipse

---

### 📌 Note

This project builds upon a classroom example and reimagines the concept with falling fireballs, developed independently to reinforce my understanding of Java Swing and game development fundamentals.

---

### 📷 Screenshots

[Game Start](screenshot1.png)

[Game Over](screenshot2.png)

[Game Win](screenshot3.png)


---

## 🔧 How to Run

1. **Clone** this repository or download the ZIP.
2. Open the project in **Eclipse IDE** (or any Java IDE).
3. Make sure the `src` folder is marked as the **Source Folder**.
4. Right-click on `GameFrame.java` (inside the `gameone` package) and select **Run As → Java Application**.
5. Use the **Right Arrow (→)** and **Left Arrow (←)** keys to move the player.
6. The game ends with a message when you either:
   - Reach the right edge of the screen (win), or  
   - Collide with a fireball (lose).

> 🔁 Note: This version does **not support restarting** after game over. To play again, simply **re-run the program**.


---

Feel free to fork, star ⭐, or suggest improvements!
