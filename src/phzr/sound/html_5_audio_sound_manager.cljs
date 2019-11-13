(ns phzr.sound.html-5-audio-sound-manager
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [remove]))

(defn ->HTML5AudioSoundManager
  "HTML5 Audio implementation of the Sound Manager.

  Note: To play multiple instances of the same HTML5 Audio sound, you need to provide an `instances` value when
  loading the sound with the Loader:

  ```javascript
  this.load.audio('explosion', 'explosion.mp3', {
      instances: 2
  });
  ```

  Parameters:
    * game (Phaser.Game) - Reference to the current game instance."
  ([game]
   (js/Phaser.Sound.HTML5AudioSoundManager. (clj->phaser game))))

(defn add
  "Adds a new sound into the sound manager.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * key (string) - Asset key for the sound.
    * config (Phaser.Types.Sound.SoundConfig) {optional} - An optional config object containing default sound settings.

  Returns:  Phaser.Sound.HTML5AudioSound - The new sound instance."
  ([html-5-audio-sound-manager key]
   (phaser->clj
    (.add html-5-audio-sound-manager
          (clj->phaser key))))
  ([html-5-audio-sound-manager key config]
   (phaser->clj
    (.add html-5-audio-sound-manager
          (clj->phaser key)
          (clj->phaser config)))))

(defn add-audio-sprite
  "Adds a new audio sprite sound into the sound manager.
  Audio Sprites are a combination of audio files and a JSON configuration.
  The JSON follows the format of that created by https://github.com/tonistiigi/audiosprite

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * key (string) - Asset key for the sound.
    * config (Phaser.Types.Sound.SoundConfig) {optional} - An optional config object containing default sound settings.

  Returns:  Phaser.Sound.HTML5AudioSound | Phaser.Sound.WebAudioSound - The new audio sprite sound instance."
  ([html-5-audio-sound-manager key]
   (phaser->clj
    (.addAudioSprite html-5-audio-sound-manager
                     (clj->phaser key))))
  ([html-5-audio-sound-manager key config]
   (phaser->clj
    (.addAudioSprite html-5-audio-sound-manager
                     (clj->phaser key)
                     (clj->phaser config)))))

(defn add-listener
  "Add a listener for a given event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) - The listener function.
    * context (*) {optional} - The context to invoke the listener with.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([html-5-audio-sound-manager event fn]
   (phaser->clj
    (.addListener html-5-audio-sound-manager
                  (clj->phaser event)
                  (clj->phaser fn))))
  ([html-5-audio-sound-manager event fn context]
   (phaser->clj
    (.addListener html-5-audio-sound-manager
                  (clj->phaser event)
                  (clj->phaser fn)
                  (clj->phaser context)))))

(defn destroy
  "Calls Phaser.Sound.BaseSoundManager#destroy method
  and cleans up all HTML5 Audio related stuff."
  ([html-5-audio-sound-manager]
   (phaser->clj
    (.destroy html-5-audio-sound-manager))))

(defn emit
  "Calls each of the listeners registered for a given event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) - The event name.
    * args (*) {optional} - Additional arguments that will be passed to the event handler.

  Returns:  boolean - `true` if the event had listeners, else `false`."
  ([html-5-audio-sound-manager event]
   (phaser->clj
    (.emit html-5-audio-sound-manager
           (clj->phaser event))))
  ([html-5-audio-sound-manager event args]
   (phaser->clj
    (.emit html-5-audio-sound-manager
           (clj->phaser event)
           (clj->phaser args)))))

(defn event-names
  "Return an array listing the events for which the emitter has registered listeners.

  Returns:  array - "
  ([html-5-audio-sound-manager]
   (phaser->clj
    (.eventNames html-5-audio-sound-manager))))

(defn listener-count
  "Return the number of listeners listening to a given event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) - The event name.

  Returns:  number - The number of listeners."
  ([html-5-audio-sound-manager event]
   (phaser->clj
    (.listenerCount html-5-audio-sound-manager
                    (clj->phaser event)))))

(defn listeners
  "Return the listeners registered for a given event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) - The event name.

  Returns:  array - The registered listeners."
  ([html-5-audio-sound-manager event]
   (phaser->clj
    (.listeners html-5-audio-sound-manager
                (clj->phaser event)))))

(defn off
  "Remove the listeners of a given event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) {optional} - Only remove the listeners that match this function.
    * context (*) {optional} - Only remove the listeners that have this context.
    * once (boolean) {optional} - Only remove one-time listeners.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([html-5-audio-sound-manager event]
   (phaser->clj
    (.off html-5-audio-sound-manager
          (clj->phaser event))))
  ([html-5-audio-sound-manager event fn]
   (phaser->clj
    (.off html-5-audio-sound-manager
          (clj->phaser event)
          (clj->phaser fn))))
  ([html-5-audio-sound-manager event fn context]
   (phaser->clj
    (.off html-5-audio-sound-manager
          (clj->phaser event)
          (clj->phaser fn)
          (clj->phaser context))))
  ([html-5-audio-sound-manager event fn context once]
   (phaser->clj
    (.off html-5-audio-sound-manager
          (clj->phaser event)
          (clj->phaser fn)
          (clj->phaser context)
          (clj->phaser once)))))

(defn on
  "Add a listener for a given event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) - The listener function.
    * context (*) {optional} - The context to invoke the listener with.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([html-5-audio-sound-manager event fn]
   (phaser->clj
    (.on html-5-audio-sound-manager
         (clj->phaser event)
         (clj->phaser fn))))
  ([html-5-audio-sound-manager event fn context]
   (phaser->clj
    (.on html-5-audio-sound-manager
         (clj->phaser event)
         (clj->phaser fn)
         (clj->phaser context)))))

(defn once
  "Add a one-time listener for a given event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) - The listener function.
    * context (*) {optional} - The context to invoke the listener with.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([html-5-audio-sound-manager event fn]
   (phaser->clj
    (.once html-5-audio-sound-manager
           (clj->phaser event)
           (clj->phaser fn))))
  ([html-5-audio-sound-manager event fn context]
   (phaser->clj
    (.once html-5-audio-sound-manager
           (clj->phaser event)
           (clj->phaser fn)
           (clj->phaser context)))))

(defn pause-all
  "Pauses all the sounds in the game."
  ([html-5-audio-sound-manager]
   (phaser->clj
    (.pauseAll html-5-audio-sound-manager))))

(defn play
  "Enables playing sound on the fly without the need to keep a reference to it.
  Sound will auto destroy once its playback ends.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * key (string) - Asset key for the sound.
    * extra (Phaser.Types.Sound.SoundConfig | Phaser.Types.Sound.SoundMarker) {optional} - An optional additional object containing settings to be applied to the sound. It could be either config or marker object.

  Returns:  boolean - Whether the sound started playing successfully."
  ([html-5-audio-sound-manager key]
   (phaser->clj
    (.play html-5-audio-sound-manager
           (clj->phaser key))))
  ([html-5-audio-sound-manager key extra]
   (phaser->clj
    (.play html-5-audio-sound-manager
           (clj->phaser key)
           (clj->phaser extra)))))

(defn play-audio-sprite
  "Enables playing audio sprite sound on the fly without the need to keep a reference to it.
  Sound will auto destroy once its playback ends.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * key (string) - Asset key for the sound.
    * sprite-name (string) - The name of the sound sprite to play.
    * config (Phaser.Types.Sound.SoundConfig) {optional} - An optional config object containing default sound settings.

  Returns:  boolean - Whether the audio sprite sound started playing successfully."
  ([html-5-audio-sound-manager key sprite-name]
   (phaser->clj
    (.playAudioSprite html-5-audio-sound-manager
                      (clj->phaser key)
                      (clj->phaser sprite-name))))
  ([html-5-audio-sound-manager key sprite-name config]
   (phaser->clj
    (.playAudioSprite html-5-audio-sound-manager
                      (clj->phaser key)
                      (clj->phaser sprite-name)
                      (clj->phaser config)))))

(defn remove
  "Removes a sound from the sound manager.
  The removed sound is destroyed before removal.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * sound (Phaser.Sound.BaseSound) - The sound object to remove.

  Returns:  boolean - True if the sound was removed successfully, otherwise false."
  ([html-5-audio-sound-manager sound]
   (phaser->clj
    (.remove html-5-audio-sound-manager
             (clj->phaser sound)))))

(defn remove-all-listeners
  "Remove all listeners, or those of the specified event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) {optional} - The event name.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([html-5-audio-sound-manager]
   (phaser->clj
    (.removeAllListeners html-5-audio-sound-manager)))
  ([html-5-audio-sound-manager event]
   (phaser->clj
    (.removeAllListeners html-5-audio-sound-manager
                         (clj->phaser event)))))

(defn remove-by-key
  "Removes all sounds from the sound manager that have an asset key matching the given value.
  The removed sounds are destroyed before removal.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * key (string) - The key to match when removing sound objects.

  Returns:  number - The number of matching sound objects that were removed."
  ([html-5-audio-sound-manager key]
   (phaser->clj
    (.removeByKey html-5-audio-sound-manager
                  (clj->phaser key)))))

(defn remove-listener
  "Remove the listeners of a given event.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) {optional} - Only remove the listeners that match this function.
    * context (*) {optional} - Only remove the listeners that have this context.
    * once (boolean) {optional} - Only remove one-time listeners.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([html-5-audio-sound-manager event]
   (phaser->clj
    (.removeListener html-5-audio-sound-manager
                     (clj->phaser event))))
  ([html-5-audio-sound-manager event fn]
   (phaser->clj
    (.removeListener html-5-audio-sound-manager
                     (clj->phaser event)
                     (clj->phaser fn))))
  ([html-5-audio-sound-manager event fn context]
   (phaser->clj
    (.removeListener html-5-audio-sound-manager
                     (clj->phaser event)
                     (clj->phaser fn)
                     (clj->phaser context))))
  ([html-5-audio-sound-manager event fn context once]
   (phaser->clj
    (.removeListener html-5-audio-sound-manager
                     (clj->phaser event)
                     (clj->phaser fn)
                     (clj->phaser context)
                     (clj->phaser once)))))

(defn resume-all
  "Resumes all the sounds in the game."
  ([html-5-audio-sound-manager]
   (phaser->clj
    (.resumeAll html-5-audio-sound-manager))))

(defn set-detune
  "Sets the global detuning of all sounds in [cents](https://en.wikipedia.org/wiki/Cent_%28music%29).
  The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * value (number) - The range of the value is -1200 to 1200, but we recommend setting it to [50](https://en.wikipedia.org/wiki/50_Cent).

  Returns:  Phaser.Sound.BaseSoundManager - This Sound Manager."
  ([html-5-audio-sound-manager value]
   (phaser->clj
    (.setDetune html-5-audio-sound-manager
                (clj->phaser value)))))

(defn set-mute
  "Sets the muted state of all this Sound Manager.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * value (boolean) - `true` to mute all sounds, `false` to unmute them.

  Returns:  Phaser.Sound.HTML5AudioSoundManager - This Sound Manager."
  ([html-5-audio-sound-manager value]
   (phaser->clj
    (.setMute html-5-audio-sound-manager
              (clj->phaser value)))))

(defn set-rate
  "Sets the global playback rate at which all the sounds will be played.

  For example, a value of 1.0 plays the audio at full speed, 0.5 plays the audio at half speed
  and 2.0 doubles the audios playback speed.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * value (number) - Global playback rate at which all the sounds will be played.

  Returns:  Phaser.Sound.BaseSoundManager - This Sound Manager."
  ([html-5-audio-sound-manager value]
   (phaser->clj
    (.setRate html-5-audio-sound-manager
              (clj->phaser value)))))

(defn set-volume
  "Sets the volume of this Sound Manager.

  Parameters:
    * html-5-audio-sound-manager (Phaser.Sound.HTML5AudioSoundManager) - Targeted instance for method
    * value (number) - The global volume of this Sound Manager.

  Returns:  Phaser.Sound.HTML5AudioSoundManager - This Sound Manager."
  ([html-5-audio-sound-manager value]
   (phaser->clj
    (.setVolume html-5-audio-sound-manager
                (clj->phaser value)))))

(defn shutdown
  "Removes all listeners."
  ([html-5-audio-sound-manager]
   (phaser->clj
    (.shutdown html-5-audio-sound-manager))))

(defn stop-all
  "Stops all the sounds in the game."
  ([html-5-audio-sound-manager]
   (phaser->clj
    (.stopAll html-5-audio-sound-manager))))

(defn unlock
  "Unlocks HTML5 Audio loading and playback on mobile
  devices on the initial explicit user interaction."
  ([html-5-audio-sound-manager]
   (phaser->clj
    (.unlock html-5-audio-sound-manager))))