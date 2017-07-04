(ns antiyoy-2.core.desktop-launcher
  (:require [antiyoy-2.core :refer :all])
  (:import [com.badlogic.gdx.backends.lwjgl LwjglApplication]
           [org.lwjgl.input Keyboard])
  (:gen-class))

(defn -main
  []
  (LwjglApplication. antiyoy-2-game "antiyoy-2" 800 600)
  (Keyboard/enableRepeatEvents true))
