package main

import (
	r "awesomeProject/router"
	_ "github.com/gorilla/mux"
	"log"
)

func main(){
	log.Println("in here")
	r.Router()

}
