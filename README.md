# MediaPlayer
## Assignment Task
Media player with toast messages provided for the media controller buttons.
Typically contains the buttons like "Play/Pause", "Rewind", "Fast Forward" and a progress slider. It takes care of synchronizing the controls with the state of the MediaPlayer.

The way to use this class is to instantiate it programmatically. The MediaController will create a default set of controls and put them in a window floating above your application. Specifically, the controls will float above the view specified with setAnchorView(). The window will disappear if left idle for three seconds and reappear when the user touches the anchor view.

## License

    Copyright 2017 Nikola Nikolovski

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
