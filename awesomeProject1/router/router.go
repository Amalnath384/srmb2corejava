package router

import (
	. "awesomeProject/pkg/service"
	"github.com/gorilla/mux"
	"log"
	"net/http"
)

func Router(){
	router := mux.NewRouter()
	router.HandleFunc("/calc/{operation}/{num1}/{num2}", Calculater).Methods("GET")
	router.HandleFunc("/calc", Calc).Methods("POST")


	log.Fatal(http.ListenAndServe("127.0.0.1:8080", router))

}


// localhost == 127.0.0.1 == nothing