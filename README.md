Moonlander
==========

This is a really simple Java 2D game made with Swing back in 2012 for a university programming lab, in about 90 minutes.

The goal is to land the LEM (lunar excursion module) on the Moon using the arrow keys to control your descent. You must land gently on relatively flat ground or you will crash. The lander's physics is simulated with basic Newtonian motion (Euler integration, nothing fancy) at 1/6 Earth gravity. You have limited fuel so you must hurry!

An interesting feature is the lander/ground collision algorithm: first the lander and the terrain's bounding boxes are checked, and if they intersect then I check several points inside the lander at random, if they are also in the terrain then the LEM must have landed (a primitive form of broadphase/narrowphase physics collision).
