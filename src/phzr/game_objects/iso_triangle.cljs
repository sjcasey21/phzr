(ns phzr.game-objects.iso-triangle
  (:require [phzr.impl.utils.core :refer [clj->phaser phaser->clj]]
            [phzr.impl.extend :as ex]
            [cljsjs.phaser])
  (:refer-clojure :exclude [update]))

(defn ->IsoTriangle
  "  Parameters:
    * scene (Phaser.Scene) - The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * x (number) {optional} - The horizontal position of this Game Object in the world.
    * y (number) {optional} - The vertical position of this Game Object in the world.
    * size (number) {optional} - The width of the iso triangle in pixels. The left and right faces will be exactly half this value.
    * height (number) {optional} - The height of the iso triangle. The left and right faces will be this tall. The overall height of the iso triangle will be this value plus half the `size` value.
    * reversed (boolean) {optional} - Is the iso triangle upside down?
    * fill-top (number) {optional} - The fill color of the top face of the iso triangle.
    * fill-left (number) {optional} - The fill color of the left face of the iso triangle.
    * fill-right (number) {optional} - The fill color of the right face of the iso triangle."
  ([scene]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)))
  ([scene x]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)
                                       (clj->phaser x)))
  ([scene x y]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)
                                       (clj->phaser x)
                                       (clj->phaser y)))
  ([scene x y size]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)
                                       (clj->phaser x)
                                       (clj->phaser y)
                                       (clj->phaser size)))
  ([scene x y size height]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)
                                       (clj->phaser x)
                                       (clj->phaser y)
                                       (clj->phaser size)
                                       (clj->phaser height)))
  ([scene x y size height reversed]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)
                                       (clj->phaser x)
                                       (clj->phaser y)
                                       (clj->phaser size)
                                       (clj->phaser height)
                                       (clj->phaser reversed)))
  ([scene x y size height reversed fill-top]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)
                                       (clj->phaser x)
                                       (clj->phaser y)
                                       (clj->phaser size)
                                       (clj->phaser height)
                                       (clj->phaser reversed)
                                       (clj->phaser fill-top)))
  ([scene x y size height reversed fill-top fill-left]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)
                                       (clj->phaser x)
                                       (clj->phaser y)
                                       (clj->phaser size)
                                       (clj->phaser height)
                                       (clj->phaser reversed)
                                       (clj->phaser fill-top)
                                       (clj->phaser fill-left)))
  ([scene x y size height reversed fill-top fill-left fill-right]
   (js/Phaser.GameObjects.IsoTriangle. (clj->phaser scene)
                                       (clj->phaser x)
                                       (clj->phaser y)
                                       (clj->phaser size)
                                       (clj->phaser height)
                                       (clj->phaser reversed)
                                       (clj->phaser fill-top)
                                       (clj->phaser fill-left)
                                       (clj->phaser fill-right))))

(defn add-listener
  "Add a listener for a given event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) - The listener function.
    * context (*) {optional} - The context to invoke the listener with.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([iso-triangle event fn]
   (phaser->clj
    (.addListener iso-triangle
                  (clj->phaser event)
                  (clj->phaser fn))))
  ([iso-triangle event fn context]
   (phaser->clj
    (.addListener iso-triangle
                  (clj->phaser event)
                  (clj->phaser fn)
                  (clj->phaser context)))))

(defn clear-alpha
  "Clears all alpha values associated with this Game Object.

  Immediately sets the alpha levels back to 1 (fully opaque).

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.clearAlpha iso-triangle))))

(defn clear-mask
  "Clears the mask that this Game Object was using.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * destroy-mask (boolean) {optional} - Destroy the mask before clearing it?

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.clearMask iso-triangle)))
  ([iso-triangle destroy-mask]
   (phaser->clj
    (.clearMask iso-triangle
                (clj->phaser destroy-mask)))))

(defn create-bitmap-mask
  "Creates and returns a Bitmap Mask. This mask can be used by any Game Object,
  including this one.

  To create the mask you need to pass in a reference to a renderable Game Object.
  A renderable Game Object is one that uses a texture to render with, such as an
  Image, Sprite, Render Texture or BitmapText.

  If you do not provide a renderable object, and this Game Object has a texture,
  it will use itself as the object. This means you can call this method to create
  a Bitmap Mask from any renderable Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * renderable (Phaser.GameObjects.GameObject) {optional} - A renderable Game Object that uses a texture, such as a Sprite.

  Returns:  Phaser.Display.Masks.BitmapMask - This Bitmap Mask that was created."
  ([iso-triangle]
   (phaser->clj
    (.createBitmapMask iso-triangle)))
  ([iso-triangle renderable]
   (phaser->clj
    (.createBitmapMask iso-triangle
                       (clj->phaser renderable)))))

(defn create-geometry-mask
  "Creates and returns a Geometry Mask. This mask can be used by any Game Object,
  including this one.

  To create the mask you need to pass in a reference to a Graphics Game Object.

  If you do not provide a graphics object, and this Game Object is an instance
  of a Graphics object, then it will use itself to create the mask.

  This means you can call this method to create a Geometry Mask from any Graphics Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * graphics (Phaser.GameObjects.Graphics) {optional} - A Graphics Game Object. The geometry within it will be used as the mask.

  Returns:  Phaser.Display.Masks.GeometryMask - This Geometry Mask that was created."
  ([iso-triangle]
   (phaser->clj
    (.createGeometryMask iso-triangle)))
  ([iso-triangle graphics]
   (phaser->clj
    (.createGeometryMask iso-triangle
                         (clj->phaser graphics)))))

(defn destroy
  "Destroys this Game Object removing it from the Display List and Update List and
  severing all ties to parent resources.

  Also removes itself from the Input Manager and Physics Manager if previously enabled.

  Use this to remove a Game Object from your game if you don't ever plan to use it again.
  As long as no reference to it exists within your own code it should become free for
  garbage collection by the browser.

  If you just want to temporarily disable an object then look at using the
  Game Object Pool instead of destroying it, as destroyed objects cannot be resurrected.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * from-scene (boolean) {optional} - Is this Game Object being destroyed as the result of a Scene shutdown?"
  ([iso-triangle]
   (phaser->clj
    (.destroy iso-triangle)))
  ([iso-triangle from-scene]
   (phaser->clj
    (.destroy iso-triangle
              (clj->phaser from-scene)))))

(defn disable-interactive
  "If this Game Object has previously been enabled for input, this will disable it.

  An object that is disabled for input stops processing or being considered for
  input events, but can be turned back on again at any time by simply calling
  `setInteractive()` with no arguments provided.

  If want to completely remove interaction from this Game Object then use `removeInteractive` instead.

  Returns:  this - This GameObject."
  ([iso-triangle]
   (phaser->clj
    (.disableInteractive iso-triangle))))

(defn emit
  "Calls each of the listeners registered for a given event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) - The event name.
    * args (*) {optional} - Additional arguments that will be passed to the event handler.

  Returns:  boolean - `true` if the event had listeners, else `false`."
  ([iso-triangle event]
   (phaser->clj
    (.emit iso-triangle
           (clj->phaser event))))
  ([iso-triangle event args]
   (phaser->clj
    (.emit iso-triangle
           (clj->phaser event)
           (clj->phaser args)))))

(defn event-names
  "Return an array listing the events for which the emitter has registered listeners.

  Returns:  array - "
  ([iso-triangle]
   (phaser->clj
    (.eventNames iso-triangle))))

(defn get-bottom-center
  "Gets the bottom-center coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.
    * include-parent (boolean) {optional} - If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector?

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getBottomCenter iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getBottomCenter iso-triangle
                      (clj->phaser output))))
  ([iso-triangle output include-parent]
   (phaser->clj
    (.getBottomCenter iso-triangle
                      (clj->phaser output)
                      (clj->phaser include-parent)))))

(defn get-bottom-left
  "Gets the bottom-left corner coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.
    * include-parent (boolean) {optional} - If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector?

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getBottomLeft iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getBottomLeft iso-triangle
                    (clj->phaser output))))
  ([iso-triangle output include-parent]
   (phaser->clj
    (.getBottomLeft iso-triangle
                    (clj->phaser output)
                    (clj->phaser include-parent)))))

(defn get-bottom-right
  "Gets the bottom-right corner coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.
    * include-parent (boolean) {optional} - If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector?

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getBottomRight iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getBottomRight iso-triangle
                     (clj->phaser output))))
  ([iso-triangle output include-parent]
   (phaser->clj
    (.getBottomRight iso-triangle
                     (clj->phaser output)
                     (clj->phaser include-parent)))))

(defn get-bounds
  "Gets the bounds of this Game Object, regardless of origin.
  The values are stored and returned in a Rectangle, or Rectangle-like, object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Geom.Rectangle | object) {optional} - An object to store the values in. If not provided a new Rectangle will be created.

  Returns:  Phaser.Geom.Rectangle | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getBounds iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getBounds iso-triangle
                (clj->phaser output)))))

(defn get-center
  "Gets the center coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getCenter iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getCenter iso-triangle
                (clj->phaser output)))))

(defn get-data
  "Retrieves the value for the given key in this Game Objects Data Manager, or undefined if it doesn't exist.

  You can also access values via the `values` object. For example, if you had a key called `gold` you can do either:

  ```javascript
  sprite.getData('gold');
  ```

  Or access the value directly:

  ```javascript
  sprite.data.values.gold;
  ```

  You can also pass in an array of keys, in which case an array of values will be returned:

  ```javascript
  sprite.getData([ 'gold', 'armor', 'health' ]);
  ```

  This approach is useful for destructuring arrays in ES6.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * key (string | Array.<string>) - The key of the value to retrieve, or an array of keys.

  Returns:  * - The value belonging to the given key, or an array of values, the order of which will match the input array."
  ([iso-triangle key]
   (phaser->clj
    (.getData iso-triangle
              (clj->phaser key)))))

(defn get-index-list
  "Returns an array containing the display list index of either this Game Object, or if it has one,
  its parent Container. It then iterates up through all of the parent containers until it hits the
  root of the display list (which is index 0 in the returned array).

  Used internally by the InputPlugin but also useful if you wish to find out the display depth of
  this Game Object and all of its ancestors.

  Returns:  Array.<integer> - An array of display list position indexes."
  ([iso-triangle]
   (phaser->clj
    (.getIndexList iso-triangle))))

(defn get-left-center
  "Gets the left-center coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.
    * include-parent (boolean) {optional} - If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector?

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getLeftCenter iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getLeftCenter iso-triangle
                    (clj->phaser output))))
  ([iso-triangle output include-parent]
   (phaser->clj
    (.getLeftCenter iso-triangle
                    (clj->phaser output)
                    (clj->phaser include-parent)))))

(defn get-local-transform-matrix
  "Gets the local transform matrix for this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * temp-matrix (Phaser.GameObjects.Components.TransformMatrix) {optional} - The matrix to populate with the values from this Game Object.

  Returns:  Phaser.GameObjects.Components.TransformMatrix - The populated Transform Matrix."
  ([iso-triangle]
   (phaser->clj
    (.getLocalTransformMatrix iso-triangle)))
  ([iso-triangle temp-matrix]
   (phaser->clj
    (.getLocalTransformMatrix iso-triangle
                              (clj->phaser temp-matrix)))))

(defn get-parent-rotation
  "Gets the sum total rotation of all of this Game Objects parent Containers.

  The returned value is in radians and will be zero if this Game Object has no parent container.

  Returns:  number - The sum total rotation, in radians, of all parent containers of this Game Object."
  ([iso-triangle]
   (phaser->clj
    (.getParentRotation iso-triangle))))

(defn get-pipeline-name
  "Gets the name of the WebGL Pipeline this Game Object is currently using.

  Returns:  string - The string-based name of the pipeline being used by this Game Object."
  ([iso-triangle]
   (phaser->clj
    (.getPipelineName iso-triangle))))

(defn get-right-center
  "Gets the right-center coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.
    * include-parent (boolean) {optional} - If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector?

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getRightCenter iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getRightCenter iso-triangle
                     (clj->phaser output))))
  ([iso-triangle output include-parent]
   (phaser->clj
    (.getRightCenter iso-triangle
                     (clj->phaser output)
                     (clj->phaser include-parent)))))

(defn get-top-center
  "Gets the top-center coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.
    * include-parent (boolean) {optional} - If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector?

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getTopCenter iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getTopCenter iso-triangle
                   (clj->phaser output))))
  ([iso-triangle output include-parent]
   (phaser->clj
    (.getTopCenter iso-triangle
                   (clj->phaser output)
                   (clj->phaser include-parent)))))

(defn get-top-left
  "Gets the top-left corner coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.
    * include-parent (boolean) {optional} - If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector?

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getTopLeft iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getTopLeft iso-triangle
                 (clj->phaser output))))
  ([iso-triangle output include-parent]
   (phaser->clj
    (.getTopLeft iso-triangle
                 (clj->phaser output)
                 (clj->phaser include-parent)))))

(defn get-top-right
  "Gets the top-right corner coordinate of this Game Object, regardless of origin.
  The returned point is calculated in local space and does not factor in any parent containers

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * output (Phaser.Math.Vector2 | object) {optional} - An object to store the values in. If not provided a new Vector2 will be created.
    * include-parent (boolean) {optional} - If this Game Object has a parent Container, include it (and all other ancestors) in the resulting vector?

  Returns:  Phaser.Math.Vector2 | object - The values stored in the output object."
  ([iso-triangle]
   (phaser->clj
    (.getTopRight iso-triangle)))
  ([iso-triangle output]
   (phaser->clj
    (.getTopRight iso-triangle
                  (clj->phaser output))))
  ([iso-triangle output include-parent]
   (phaser->clj
    (.getTopRight iso-triangle
                  (clj->phaser output)
                  (clj->phaser include-parent)))))

(defn get-world-transform-matrix
  "Gets the world transform matrix for this Game Object, factoring in any parent Containers.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * temp-matrix (Phaser.GameObjects.Components.TransformMatrix) {optional} - The matrix to populate with the values from this Game Object.
    * parent-matrix (Phaser.GameObjects.Components.TransformMatrix) {optional} - A temporary matrix to hold parent values during the calculations.

  Returns:  Phaser.GameObjects.Components.TransformMatrix - The populated Transform Matrix."
  ([iso-triangle]
   (phaser->clj
    (.getWorldTransformMatrix iso-triangle)))
  ([iso-triangle temp-matrix]
   (phaser->clj
    (.getWorldTransformMatrix iso-triangle
                              (clj->phaser temp-matrix))))
  ([iso-triangle temp-matrix parent-matrix]
   (phaser->clj
    (.getWorldTransformMatrix iso-triangle
                              (clj->phaser temp-matrix)
                              (clj->phaser parent-matrix)))))

(defn init-pipeline
  "Sets the initial WebGL Pipeline of this Game Object.
  This should only be called during the instantiation of the Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * pipeline-name (string) {optional} - The name of the pipeline to set on this Game Object. Defaults to the Texture Tint Pipeline.

  Returns:  boolean - `true` if the pipeline was set successfully, otherwise `false`."
  ([iso-triangle]
   (phaser->clj
    (.initPipeline iso-triangle)))
  ([iso-triangle pipeline-name]
   (phaser->clj
    (.initPipeline iso-triangle
                   (clj->phaser pipeline-name)))))

(defn listener-count
  "Return the number of listeners listening to a given event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) - The event name.

  Returns:  number - The number of listeners."
  ([iso-triangle event]
   (phaser->clj
    (.listenerCount iso-triangle
                    (clj->phaser event)))))

(defn listeners
  "Return the listeners registered for a given event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) - The event name.

  Returns:  array - The registered listeners."
  ([iso-triangle event]
   (phaser->clj
    (.listeners iso-triangle
                (clj->phaser event)))))

(defn off
  "Remove the listeners of a given event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) {optional} - Only remove the listeners that match this function.
    * context (*) {optional} - Only remove the listeners that have this context.
    * once (boolean) {optional} - Only remove one-time listeners.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([iso-triangle event]
   (phaser->clj
    (.off iso-triangle
          (clj->phaser event))))
  ([iso-triangle event fn]
   (phaser->clj
    (.off iso-triangle
          (clj->phaser event)
          (clj->phaser fn))))
  ([iso-triangle event fn context]
   (phaser->clj
    (.off iso-triangle
          (clj->phaser event)
          (clj->phaser fn)
          (clj->phaser context))))
  ([iso-triangle event fn context once]
   (phaser->clj
    (.off iso-triangle
          (clj->phaser event)
          (clj->phaser fn)
          (clj->phaser context)
          (clj->phaser once)))))

(defn on
  "Add a listener for a given event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) - The listener function.
    * context (*) {optional} - The context to invoke the listener with.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([iso-triangle event fn]
   (phaser->clj
    (.on iso-triangle
         (clj->phaser event)
         (clj->phaser fn))))
  ([iso-triangle event fn context]
   (phaser->clj
    (.on iso-triangle
         (clj->phaser event)
         (clj->phaser fn)
         (clj->phaser context)))))

(defn once
  "Add a one-time listener for a given event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) - The listener function.
    * context (*) {optional} - The context to invoke the listener with.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([iso-triangle event fn]
   (phaser->clj
    (.once iso-triangle
           (clj->phaser event)
           (clj->phaser fn))))
  ([iso-triangle event fn context]
   (phaser->clj
    (.once iso-triangle
           (clj->phaser event)
           (clj->phaser fn)
           (clj->phaser context)))))

(defn remove-all-listeners
  "Remove all listeners, or those of the specified event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) {optional} - The event name.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([iso-triangle]
   (phaser->clj
    (.removeAllListeners iso-triangle)))
  ([iso-triangle event]
   (phaser->clj
    (.removeAllListeners iso-triangle
                         (clj->phaser event)))))

(defn remove-interactive
  "If this Game Object has previously been enabled for input, this will queue it
  for removal, causing it to no longer be interactive. The removal happens on
  the next game step, it is not immediate.

  The Interactive Object that was assigned to this Game Object will be destroyed,
  removed from the Input Manager and cleared from this Game Object.

  If you wish to re-enable this Game Object at a later date you will need to
  re-create its InteractiveObject by calling `setInteractive` again.

  If you wish to only temporarily stop an object from receiving input then use
  `disableInteractive` instead, as that toggles the interactive state, where-as
  this erases it completely.

  If you wish to resize a hit area, don't remove and then set it as being
  interactive. Instead, access the hitarea object directly and resize the shape
  being used. I.e.: `sprite.input.hitArea.setSize(width, height)` (assuming the
  shape is a Rectangle, which it is by default.)

  Returns:  this - This GameObject."
  ([iso-triangle]
   (phaser->clj
    (.removeInteractive iso-triangle))))

(defn remove-listener
  "Remove the listeners of a given event.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * event (string | symbol) - The event name.
    * fn (function) {optional} - Only remove the listeners that match this function.
    * context (*) {optional} - Only remove the listeners that have this context.
    * once (boolean) {optional} - Only remove one-time listeners.

  Returns:  Phaser.Events.EventEmitter - `this`."
  ([iso-triangle event]
   (phaser->clj
    (.removeListener iso-triangle
                     (clj->phaser event))))
  ([iso-triangle event fn]
   (phaser->clj
    (.removeListener iso-triangle
                     (clj->phaser event)
                     (clj->phaser fn))))
  ([iso-triangle event fn context]
   (phaser->clj
    (.removeListener iso-triangle
                     (clj->phaser event)
                     (clj->phaser fn)
                     (clj->phaser context))))
  ([iso-triangle event fn context once]
   (phaser->clj
    (.removeListener iso-triangle
                     (clj->phaser event)
                     (clj->phaser fn)
                     (clj->phaser context)
                     (clj->phaser once)))))

(defn reset-pipeline
  "Resets the WebGL Pipeline of this Game Object back to the default it was created with.

  Returns:  boolean - `true` if the pipeline was set successfully, otherwise `false`."
  ([iso-triangle]
   (phaser->clj
    (.resetPipeline iso-triangle))))

(defn set-active
  "Sets the `active` property of this Game Object and returns this Game Object for further chaining.
  A Game Object with its `active` property set to `true` will be updated by the Scenes UpdateList.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (boolean) - True if this Game Object should be set as active, false if not.

  Returns:  this - This GameObject."
  ([iso-triangle value]
   (phaser->clj
    (.setActive iso-triangle
                (clj->phaser value)))))

(defn set-alpha
  "Set the Alpha level of this Game Object. The alpha controls the opacity of the Game Object as it renders.
  Alpha values are provided as a float between 0, fully transparent, and 1, fully opaque.

  If your game is running under WebGL you can optionally specify four different alpha values, each of which
  correspond to the four corners of the Game Object. Under Canvas only the `topLeft` value given is used.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * top-left (number) {optional} - The alpha value used for the top-left of the Game Object. If this is the only value given it's applied across the whole Game Object.
    * top-right (number) {optional} - The alpha value used for the top-right of the Game Object. WebGL only.
    * bottom-left (number) {optional} - The alpha value used for the bottom-left of the Game Object. WebGL only.
    * bottom-right (number) {optional} - The alpha value used for the bottom-right of the Game Object. WebGL only.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setAlpha iso-triangle)))
  ([iso-triangle top-left]
   (phaser->clj
    (.setAlpha iso-triangle
               (clj->phaser top-left))))
  ([iso-triangle top-left top-right]
   (phaser->clj
    (.setAlpha iso-triangle
               (clj->phaser top-left)
               (clj->phaser top-right))))
  ([iso-triangle top-left top-right bottom-left]
   (phaser->clj
    (.setAlpha iso-triangle
               (clj->phaser top-left)
               (clj->phaser top-right)
               (clj->phaser bottom-left))))
  ([iso-triangle top-left top-right bottom-left bottom-right]
   (phaser->clj
    (.setAlpha iso-triangle
               (clj->phaser top-left)
               (clj->phaser top-right)
               (clj->phaser bottom-left)
               (clj->phaser bottom-right)))))

(defn set-angle
  "Sets the angle of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * degrees (number) {optional} - The rotation of this Game Object, in degrees.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setAngle iso-triangle)))
  ([iso-triangle degrees]
   (phaser->clj
    (.setAngle iso-triangle
               (clj->phaser degrees)))))

(defn set-blend-mode
  "Sets the Blend Mode being used by this Game Object.

  This can be a const, such as `Phaser.BlendModes.SCREEN`, or an integer, such as 4 (for Overlay)

  Under WebGL only the following Blend Modes are available:

  * ADD
  * MULTIPLY
  * SCREEN
  * ERASE (only works when rendering to a framebuffer, like a Render Texture)

  Canvas has more available depending on browser support.

  You can also create your own custom Blend Modes in WebGL.

  Blend modes have different effects under Canvas and WebGL, and from browser to browser, depending
  on support. Blend Modes also cause a WebGL batch flush should it encounter a new blend mode. For these
  reasons try to be careful about the construction of your Scene and the frequency in which blend modes
  are used.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (string | Phaser.BlendModes) - The BlendMode value. Either a string or a CONST.

  Returns:  this - This Game Object instance."
  ([iso-triangle value]
   (phaser->clj
    (.setBlendMode iso-triangle
                   (clj->phaser value)))))

(defn set-close-path
  "Sets if this Shape path is closed during rendering when stroked.
  Note that some Shapes are always closed when stroked (such as Ellipse shapes)

  This call can be chained.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (boolean) - Set to `true` if the Shape should be closed when stroked, otherwise `false`.

  Returns:  this - This Game Object instance."
  ([iso-triangle value]
   (phaser->clj
    (.setClosePath iso-triangle
                   (clj->phaser value)))))

(defn set-data
  "Allows you to store a key value pair within this Game Objects Data Manager.

  If the Game Object has not been enabled for data (via `setDataEnabled`) then it will be enabled
  before setting the value.

  If the key doesn't already exist in the Data Manager then it is created.

  ```javascript
  sprite.setData('name', 'Red Gem Stone');
  ```

  You can also pass in an object of key value pairs as the first argument:

  ```javascript
  sprite.setData({ name: 'Red Gem Stone', level: 2, owner: 'Link', gold: 50 });
  ```

  To get a value back again you can call `getData`:

  ```javascript
  sprite.getData('gold');
  ```

  Or you can access the value directly via the `values` property, where it works like any other variable:

  ```javascript
  sprite.data.values.gold += 50;
  ```

  When the value is first set, a `setdata` event is emitted from this Game Object.

  If the key already exists, a `changedata` event is emitted instead, along an event named after the key.
  For example, if you updated an existing key called `PlayerLives` then it would emit the event `changedata-PlayerLives`.
  These events will be emitted regardless if you use this method to set the value, or the direct `values` setter.

  Please note that the data keys are case-sensitive and must be valid JavaScript Object property strings.
  This means the keys `gold` and `Gold` are treated as two unique values within the Data Manager.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * key (string | object) - The key to set the value for. Or an object of key value pairs. If an object the `data` argument is ignored.
    * data (*) {optional} - The value to set for the given key. If an object is provided as the key this argument is ignored.

  Returns:  this - This GameObject."
  ([iso-triangle key]
   (phaser->clj
    (.setData iso-triangle
              (clj->phaser key))))
  ([iso-triangle key data]
   (phaser->clj
    (.setData iso-triangle
              (clj->phaser key)
              (clj->phaser data)))))

(defn set-data-enabled
  "Adds a Data Manager component to this Game Object.

  Returns:  this - This GameObject."
  ([iso-triangle]
   (phaser->clj
    (.setDataEnabled iso-triangle))))

(defn set-depth
  "The depth of this Game Object within the Scene.

  The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
  of Game Objects, without actually moving their position in the display list.

  The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
  value will always render in front of one with a lower value.

  Setting the depth will queue a depth sort event within the Scene.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (integer) - The depth of this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle value]
   (phaser->clj
    (.setDepth iso-triangle
               (clj->phaser value)))))

(defn set-display-origin
  "Sets the display origin of this Game Object.
  The difference between this and setting the origin is that you can use pixel values for setting the display origin.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * x (number) {optional} - The horizontal display origin value.
    * y (number) {optional} - The vertical display origin value. If not defined it will be set to the value of `x`.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setDisplayOrigin iso-triangle)))
  ([iso-triangle x]
   (phaser->clj
    (.setDisplayOrigin iso-triangle
                       (clj->phaser x))))
  ([iso-triangle x y]
   (phaser->clj
    (.setDisplayOrigin iso-triangle
                       (clj->phaser x)
                       (clj->phaser y)))))

(defn set-display-size
  "Sets the display size of this Game Object.

  Calling this will adjust the scale.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * width (number) - The width of this Game Object.
    * height (number) - The height of this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle width height]
   (phaser->clj
    (.setDisplaySize iso-triangle
                     (clj->phaser width)
                     (clj->phaser height)))))

(defn set-faces
  "Sets which faces of the iso triangle will be rendered.
  This call can be chained.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * show-top (boolean) {optional} - Show the top-face of the iso triangle (only if `reversed` is true)
    * show-left (boolean) {optional} - Show the left-face of the iso triangle.
    * show-right (boolean) {optional} - Show the right-face of the iso triangle.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setFaces iso-triangle)))
  ([iso-triangle show-top]
   (phaser->clj
    (.setFaces iso-triangle
               (clj->phaser show-top))))
  ([iso-triangle show-top show-left]
   (phaser->clj
    (.setFaces iso-triangle
               (clj->phaser show-top)
               (clj->phaser show-left))))
  ([iso-triangle show-top show-left show-right]
   (phaser->clj
    (.setFaces iso-triangle
               (clj->phaser show-top)
               (clj->phaser show-left)
               (clj->phaser show-right)))))

(defn set-fill-style
  "Sets the fill colors for each face of the iso triangle.
  This call can be chained.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * fill-top (number) {optional} - The color used to fill the top of the iso triangle.
    * fill-left (number) {optional} - The color used to fill in the left-facing side of the iso triangle.
    * fill-right (number) {optional} - The color used to fill in the right-facing side of the iso triangle.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setFillStyle iso-triangle)))
  ([iso-triangle fill-top]
   (phaser->clj
    (.setFillStyle iso-triangle
                   (clj->phaser fill-top))))
  ([iso-triangle fill-top fill-left]
   (phaser->clj
    (.setFillStyle iso-triangle
                   (clj->phaser fill-top)
                   (clj->phaser fill-left))))
  ([iso-triangle fill-top fill-left fill-right]
   (phaser->clj
    (.setFillStyle iso-triangle
                   (clj->phaser fill-top)
                   (clj->phaser fill-left)
                   (clj->phaser fill-right)))))

(defn set-interactive
  "Pass this Game Object to the Input Manager to enable it for Input.

  Input works by using hit areas, these are nearly always geometric shapes, such as rectangles or circles, that act as the hit area
  for the Game Object. However, you can provide your own hit area shape and callback, should you wish to handle some more advanced
  input detection.

  If no arguments are provided it will try and create a rectangle hit area based on the texture frame the Game Object is using. If
  this isn't a texture-bound object, such as a Graphics or BitmapText object, this will fail, and you'll need to provide a specific
  shape for it to use.

  You can also provide an Input Configuration Object as the only argument to this method.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * shape (Phaser.Types.Input.InputConfiguration | any) {optional} - Either an input configuration object, or a geometric shape that defines the hit area for the Game Object. If not specified a Rectangle will be used.
    * callback (Phaser.Types.Input.HitAreaCallback) {optional} - A callback to be invoked when the Game Object is interacted with. If you provide a shape you must also provide a callback.
    * drop-zone (boolean) {optional} - Should this Game Object be treated as a drop zone target?

  Returns:  this - This GameObject."
  ([iso-triangle]
   (phaser->clj
    (.setInteractive iso-triangle)))
  ([iso-triangle shape]
   (phaser->clj
    (.setInteractive iso-triangle
                     (clj->phaser shape))))
  ([iso-triangle shape callback]
   (phaser->clj
    (.setInteractive iso-triangle
                     (clj->phaser shape)
                     (clj->phaser callback))))
  ([iso-triangle shape callback drop-zone]
   (phaser->clj
    (.setInteractive iso-triangle
                     (clj->phaser shape)
                     (clj->phaser callback)
                     (clj->phaser drop-zone)))))

(defn set-mask
  "Sets the mask that this Game Object will use to render with.

  The mask must have been previously created and can be either a GeometryMask or a BitmapMask.
  Note: Bitmap Masks only work on WebGL. Geometry Masks work on both WebGL and Canvas.

  If a mask is already set on this Game Object it will be immediately replaced.

  Masks are positioned in global space and are not relative to the Game Object to which they
  are applied. The reason for this is that multiple Game Objects can all share the same mask.

  Masks have no impact on physics or input detection. They are purely a rendering component
  that allows you to limit what is visible during the render pass.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * mask (Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask) - The mask this Game Object will use when rendering.

  Returns:  this - This Game Object instance."
  ([iso-triangle mask]
   (phaser->clj
    (.setMask iso-triangle
              (clj->phaser mask)))))

(defn set-name
  "Sets the `name` property of this Game Object and returns this Game Object for further chaining.
  The `name` property is not populated by Phaser and is presented for your own use.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (string) - The name to be given to this Game Object.

  Returns:  this - This GameObject."
  ([iso-triangle value]
   (phaser->clj
    (.setName iso-triangle
              (clj->phaser value)))))

(defn set-origin
  "Sets the origin of this Game Object.

  The values are given in the range 0 to 1.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * x (number) {optional} - The horizontal origin value.
    * y (number) {optional} - The vertical origin value. If not defined it will be set to the value of `x`.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setOrigin iso-triangle)))
  ([iso-triangle x]
   (phaser->clj
    (.setOrigin iso-triangle
                (clj->phaser x))))
  ([iso-triangle x y]
   (phaser->clj
    (.setOrigin iso-triangle
                (clj->phaser x)
                (clj->phaser y)))))

(defn set-origin-from-frame
  "Sets the origin of this Game Object based on the Pivot values in its Frame.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setOriginFromFrame iso-triangle))))

(defn set-pipeline
  "Sets the active WebGL Pipeline of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * pipeline-name (string) - The name of the pipeline to set on this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle pipeline-name]
   (phaser->clj
    (.setPipeline iso-triangle
                  (clj->phaser pipeline-name)))))

(defn set-position
  "Sets the position of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * x (number) {optional} - The x position of this Game Object.
    * y (number) {optional} - The y position of this Game Object. If not set it will use the `x` value.
    * z (number) {optional} - The z position of this Game Object.
    * w (number) {optional} - The w position of this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setPosition iso-triangle)))
  ([iso-triangle x]
   (phaser->clj
    (.setPosition iso-triangle
                  (clj->phaser x))))
  ([iso-triangle x y]
   (phaser->clj
    (.setPosition iso-triangle
                  (clj->phaser x)
                  (clj->phaser y))))
  ([iso-triangle x y z]
   (phaser->clj
    (.setPosition iso-triangle
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser z))))
  ([iso-triangle x y z w]
   (phaser->clj
    (.setPosition iso-triangle
                  (clj->phaser x)
                  (clj->phaser y)
                  (clj->phaser z)
                  (clj->phaser w)))))

(defn set-projection
  "Sets the projection level of the iso triangle. Change this to change the 'angle' at which you are looking at the pyramid.
  This call can be chained.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (integer) - The value to set the projection to.

  Returns:  this - This Game Object instance."
  ([iso-triangle value]
   (phaser->clj
    (.setProjection iso-triangle
                    (clj->phaser value)))))

(defn set-random-position
  "Sets the position of this Game Object to be a random position within the confines of
  the given area.

  If no area is specified a random position between 0 x 0 and the game width x height is used instead.

  The position does not factor in the size of this Game Object, meaning that only the origin is
  guaranteed to be within the area.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * x (number) {optional} - The x position of the top-left of the random area.
    * y (number) {optional} - The y position of the top-left of the random area.
    * width (number) {optional} - The width of the random area.
    * height (number) {optional} - The height of the random area.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setRandomPosition iso-triangle)))
  ([iso-triangle x]
   (phaser->clj
    (.setRandomPosition iso-triangle
                        (clj->phaser x))))
  ([iso-triangle x y]
   (phaser->clj
    (.setRandomPosition iso-triangle
                        (clj->phaser x)
                        (clj->phaser y))))
  ([iso-triangle x y width]
   (phaser->clj
    (.setRandomPosition iso-triangle
                        (clj->phaser x)
                        (clj->phaser y)
                        (clj->phaser width))))
  ([iso-triangle x y width height]
   (phaser->clj
    (.setRandomPosition iso-triangle
                        (clj->phaser x)
                        (clj->phaser y)
                        (clj->phaser width)
                        (clj->phaser height)))))

(defn set-reversed
  "Sets if the iso triangle will be rendered upside down or not.
  This call can be chained.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * reversed (boolean) - Sets if the iso triangle will be rendered upside down or not.

  Returns:  this - This Game Object instance."
  ([iso-triangle reversed]
   (phaser->clj
    (.setReversed iso-triangle
                  (clj->phaser reversed)))))

(defn set-rotation
  "Sets the rotation of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * radians (number) {optional} - The rotation of this Game Object, in radians.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setRotation iso-triangle)))
  ([iso-triangle radians]
   (phaser->clj
    (.setRotation iso-triangle
                  (clj->phaser radians)))))

(defn set-scale
  "Sets the scale of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * x (number) - The horizontal scale of this Game Object.
    * y (number) {optional} - The vertical scale of this Game Object. If not set it will use the `x` value.

  Returns:  this - This Game Object instance."
  ([iso-triangle x]
   (phaser->clj
    (.setScale iso-triangle
               (clj->phaser x))))
  ([iso-triangle x y]
   (phaser->clj
    (.setScale iso-triangle
               (clj->phaser x)
               (clj->phaser y)))))

(defn set-scroll-factor
  "Sets the scroll factor of this Game Object.

  The scroll factor controls the influence of the movement of a Camera upon this Game Object.

  When a camera scrolls it will change the location at which this Game Object is rendered on-screen.
  It does not change the Game Objects actual position values.

  A value of 1 means it will move exactly in sync with a camera.
  A value of 0 means it will not move at all, even if the camera moves.
  Other values control the degree to which the camera movement is mapped to this Game Object.

  Please be aware that scroll factor values other than 1 are not taken in to consideration when
  calculating physics collisions. Bodies always collide based on their world position, but changing
  the scroll factor is a visual adjustment to where the textures are rendered, which can offset
  them from physics bodies if not accounted for in your code.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * x (number) - The horizontal scroll factor of this Game Object.
    * y (number) {optional} - The vertical scroll factor of this Game Object. If not set it will use the `x` value.

  Returns:  this - This Game Object instance."
  ([iso-triangle x]
   (phaser->clj
    (.setScrollFactor iso-triangle
                      (clj->phaser x))))
  ([iso-triangle x y]
   (phaser->clj
    (.setScrollFactor iso-triangle
                      (clj->phaser x)
                      (clj->phaser y)))))

(defn set-size
  "Sets the internal size of this Game Object, as used for frame or physics body creation.

  This will not change the size that the Game Object is rendered in-game.
  For that you need to either set the scale of the Game Object (`setScale`) or call the
  `setDisplaySize` method, which is the same thing as changing the scale but allows you
  to do so by giving pixel values.

  If you have enabled this Game Object for input, changing the size will _not_ change the
  size of the hit area. To do this you should adjust the `input.hitArea` object directly.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * width (number) - The width of this Game Object.
    * height (number) - The height of this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle width height]
   (phaser->clj
    (.setSize iso-triangle
              (clj->phaser width)
              (clj->phaser height)))))

(defn set-state
  "Sets the current state of this Game Object.

  Phaser itself will never modify the State of a Game Object, although plugins may do so.

  For example, a Game Object could change from a state of 'moving', to 'attacking', to 'dead'.
  The state value should typically be an integer (ideally mapped to a constant
  in your game code), but could also be a string. It is recommended to keep it light and simple.
  If you need to store complex data about your Game Object, look at using the Data Component instead.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (integer | string) - The state of the Game Object.

  Returns:  this - This GameObject."
  ([iso-triangle value]
   (phaser->clj
    (.setState iso-triangle
               (clj->phaser value)))))

(defn set-stroke-style
  "Sets the stroke color and alpha for this Shape.

  If you wish for the Shape to not be stroked then call this method with no arguments, or just set `isStroked` to `false`.

  Note that some Shapes do not support being stroked, such as the Iso Box shape.

  This call can be chained.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * line-width (number) {optional} - The width of line to stroke with. If not provided or undefined the Shape will not be stroked.
    * color (number) {optional} - The color used to stroke this shape. If not provided the Shape will not be stroked.
    * alpha (number) {optional} - The alpha value used when stroking this shape, if a stroke color is given.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setStrokeStyle iso-triangle)))
  ([iso-triangle line-width]
   (phaser->clj
    (.setStrokeStyle iso-triangle
                     (clj->phaser line-width))))
  ([iso-triangle line-width color]
   (phaser->clj
    (.setStrokeStyle iso-triangle
                     (clj->phaser line-width)
                     (clj->phaser color))))
  ([iso-triangle line-width color alpha]
   (phaser->clj
    (.setStrokeStyle iso-triangle
                     (clj->phaser line-width)
                     (clj->phaser color)
                     (clj->phaser alpha)))))

(defn set-visible
  "Sets the visibility of this Game Object.

  An invisible Game Object will skip rendering, but will still process update logic.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (boolean) - The visible state of the Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle value]
   (phaser->clj
    (.setVisible iso-triangle
                 (clj->phaser value)))))

(defn set-w
  "Sets the w position of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (number) {optional} - The w position of this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setW iso-triangle)))
  ([iso-triangle value]
   (phaser->clj
    (.setW iso-triangle
           (clj->phaser value)))))

(defn set-x
  "Sets the x position of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (number) {optional} - The x position of this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setX iso-triangle)))
  ([iso-triangle value]
   (phaser->clj
    (.setX iso-triangle
           (clj->phaser value)))))

(defn set-y
  "Sets the y position of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (number) {optional} - The y position of this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setY iso-triangle)))
  ([iso-triangle value]
   (phaser->clj
    (.setY iso-triangle
           (clj->phaser value)))))

(defn set-z
  "Sets the z position of this Game Object.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * value (number) {optional} - The z position of this Game Object.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.setZ iso-triangle)))
  ([iso-triangle value]
   (phaser->clj
    (.setZ iso-triangle
           (clj->phaser value)))))

(defn shutdown
  "Removes all listeners."
  ([iso-triangle]
   (phaser->clj
    (.shutdown iso-triangle))))

(defn to-json
  "Returns a JSON representation of the Game Object.

  Returns:  Phaser.Types.GameObjects.JSONGameObject - A JSON representation of the Game Object."
  ([iso-triangle]
   (phaser->clj
    (.toJSON iso-triangle))))

(defn update
  "To be overridden by custom GameObjects. Allows base objects to be used in a Pool.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * args (*) {optional} - args"
  ([iso-triangle]
   (phaser->clj
    (.update iso-triangle)))
  ([iso-triangle args]
   (phaser->clj
    (.update iso-triangle
             (clj->phaser args)))))

(defn update-display-origin
  "Updates the Display Origin cached values internally stored on this Game Object.
  You don't usually call this directly, but it is exposed for edge-cases where you may.

  Returns:  this - This Game Object instance."
  ([iso-triangle]
   (phaser->clj
    (.updateDisplayOrigin iso-triangle))))

(defn will-render
  "Compares the renderMask with the renderFlags to see if this Game Object will render or not.
  Also checks the Game Object against the given Cameras exclusion list.

  Parameters:
    * iso-triangle (Phaser.GameObjects.IsoTriangle) - Targeted instance for method
    * camera (Phaser.Cameras.Scene2D.Camera) - The Camera to check against this Game Object.

  Returns:  boolean - True if the Game Object should be rendered, otherwise false."
  ([iso-triangle camera]
   (phaser->clj
    (.willRender iso-triangle
                 (clj->phaser camera)))))