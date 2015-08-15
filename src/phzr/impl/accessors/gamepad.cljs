(ns phzr.impl.accessors.gamepad)

(def gamepad-get-properties
  {:pad-1 "pad1"
   :supported "supported"
   :game "game"
   :on-disconnect-callback "onDisconnectCallback"
   :on-connect-callback "onConnectCallback"
   :on-down-callback "onDownCallback"
   :pad-4 "pad4"
   :active "active"
   :on-float-callback "onFloatCallback"
   :pads-connected "padsConnected"
   :callback-context "callbackContext"
   :pad-3 "pad3"
   :pad-2 "pad2"
   :on-axis-callback "onAxisCallback"
   :enabled "enabled"
   :on-up-callback "onUpCallback"})

(def gamepad-set-properties
  {:game "game"
   :on-disconnect-callback "onDisconnectCallback"
   :on-connect-callback "onConnectCallback"
   :on-down-callback "onDownCallback"
   :on-float-callback "onFloatCallback"
   :callback-context "callbackContext"
   :on-axis-callback "onAxisCallback"
   :enabled "enabled"
   :on-up-callback "onUpCallback"})