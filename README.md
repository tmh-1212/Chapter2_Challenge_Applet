Project: Chapter2_Challenge_Applet
Author: [Your Name]
Date: October 2025

===============================================
PART 2: THE CRITICAL ANALYSIS
===============================================

1. SECURITY:

Java Applets were based on a "sandbox" security model designed to protect users from potentially harmful code. Because of this, applets were severely restricted in what they could do by default. Two key restrictions were:

  - File Access: Applets could not read from or write to files on the user's local machine unless explicitly granted permission (which was rare and risky).
  - Network Access: Applets were only allowed to communicate with the server they were loaded from — they could not make network connections to arbitrary third-party servers.

These restrictions helped prevent applets from being used maliciously but also limited their usefulness.

------------------------------------------------

2. MODERN REPLACEMENT:

Java Applets have been completely replaced by modern web technologies. The main trio is:

  - HTML: Structures the content.
  - CSS: Styles the content.
  - JavaScript: Adds interactivity and animation.

Example: Bouncing Text Animation Using HTML5 Canvas + JavaScript (sine wave style):

```html
<canvas id="canvas" width="500" height="200"></canvas>
<script>
  const canvas = document.getElementById('canvas');
  const ctx = canvas.getContext('2d');
  let x = 0;
  let angle = 0;
  const text = "YourName";

  function draw() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    const y = canvas.height / 2 + Math.sin(angle) * 30;
    ctx.font = "20px Arial";
    ctx.fillStyle = "cyan";
    ctx.fillText(text, x, y);

    x += 5;
    angle += 0.1;

    if (x > canvas.width) x = -ctx.measureText(te
