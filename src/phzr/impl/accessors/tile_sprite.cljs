(ns phzr.impl.accessors.tile-sprite)

(def tile-sprite-get-properties
  {:y "y"
   :exists "exists"
   :animations "animations"
   :mask "mask"
   :render-order-id "renderOrderID"
   :in-world "inWorld"
   :children "children"
   :check-world-bounds "checkWorldBounds"
   :cache-as-bitmap "cacheAsBitmap"
   :fixed-to-camera "fixedToCamera"
   :rotation "rotation"
   :stage "stage"
   :frame "frame"
   :tile-scale "tileScale"
   :key "key"
   :parent "parent"
   :previous-rotation "previousRotation"
   :bottom "bottom"
   :transform-callback "transformCallback"
   :world-visible "worldVisible"
   :scale "scale"
   :camera-offset "cameraOffset"
   :game "game"
   :top "top"
   :filters "filters"
   :blend-mode "blendMode"
   :offset-y "offsetY"
   :name "name"
   :frame-name "frameName"
   :filter-area "filterArea"
   :events "events"
   :alive "alive"
   :tinted-texture "tintedTexture"
   :renderable "renderable"
   :width "width"
   :canvas-buffer "canvasBuffer"
   :type "type"
   :previous-position "previousPosition"
   :debug "debug"
   :max-health "maxHealth"
   :angle "angle"
   :tile-scale-offset "tileScaleOffset"
   :world-rotation "worldRotation"
   :tint "tint"
   :physics-type "physicsType"
   :hit-area "hitArea"
   :transform-callback-context "transformCallbackContext"
   :world "world"
   :z "z"
   :auto-cull "autoCull"
   :input-enabled "inputEnabled"
   :damage "damage"
   :world-scale "worldScale"
   :world-position "worldPosition"
   :in-camera "inCamera"
   :pending-destroy "pendingDestroy"
   :world-alpha "worldAlpha"
   :offset-x "offsetX"
   :texture-debug "textureDebug"
   :alpha "alpha"
   :right "right"
   :health "health"
   :out-of-bounds-kill "outOfBoundsKill"
   :position "position"
   :heal "heal"
   :pivot "pivot"
   :x "x"
   :lifespan "lifespan"
   :smoothed "smoothed"
   :anchor "anchor"
   :input "input"
   :destroy-phase "destroyPhase"
   :visible "visible"
   :tiling-texture "tilingTexture"
   :body "body"
   :tile-pattern "tilePattern"
   :refresh-texture "refreshTexture"
   :tile-position "tilePosition"
   :texture "texture"
   :shader "shader"
   :fresh "fresh"
   :height "height"
   :left "left"})

(def tile-sprite-set-properties
  {:y "y"
   :exists "exists"
   :animations "animations"
   :mask "mask"
   :check-world-bounds "checkWorldBounds"
   :cache-as-bitmap "cacheAsBitmap"
   :fixed-to-camera "fixedToCamera"
   :rotation "rotation"
   :frame "frame"
   :tile-scale "tileScale"
   :key "key"
   :transform-callback "transformCallback"
   :world-visible "worldVisible"
   :scale "scale"
   :camera-offset "cameraOffset"
   :game "game"
   :filters "filters"
   :blend-mode "blendMode"
   :name "name"
   :frame-name "frameName"
   :filter-area "filterArea"
   :events "events"
   :alive "alive"
   :tinted-texture "tintedTexture"
   :renderable "renderable"
   :width "width"
   :canvas-buffer "canvasBuffer"
   :debug "debug"
   :max-health "maxHealth"
   :angle "angle"
   :tile-scale-offset "tileScaleOffset"
   :tint "tint"
   :hit-area "hitArea"
   :transform-callback-context "transformCallbackContext"
   :world "world"
   :z "z"
   :auto-cull "autoCull"
   :input-enabled "inputEnabled"
   :damage "damage"
   :pending-destroy "pendingDestroy"
   :texture-debug "textureDebug"
   :alpha "alpha"
   :health "health"
   :out-of-bounds-kill "outOfBoundsKill"
   :position "position"
   :heal "heal"
   :pivot "pivot"
   :x "x"
   :lifespan "lifespan"
   :smoothed "smoothed"
   :anchor "anchor"
   :input "input"
   :visible "visible"
   :tiling-texture "tilingTexture"
   :body "body"
   :tile-pattern "tilePattern"
   :refresh-texture "refreshTexture"
   :tile-position "tilePosition"
   :texture "texture"
   :shader "shader"
   :height "height"})