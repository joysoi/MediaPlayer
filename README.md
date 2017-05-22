# MediaPlayer
Media player with toast messages provided for the media controller buttons.
Typically contains the buttons like "Play/Pause", "Rewind", "Fast Forward" and a progress slider. It takes care of synchronizing the controls with the state of the MediaPlayer.

The way to use this class is to instantiate it programmatically. The MediaController will create a default set of controls and put them in a window floating above your application. Specifically, the controls will float above the view specified with setAnchorView(). The window will disappear if left idle for three seconds and reappear when the user touches the anchor view.
