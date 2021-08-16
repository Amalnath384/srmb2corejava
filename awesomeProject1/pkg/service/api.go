package service

import (
	"awesomeProject/pkg/model"
	"encoding/json"
	"fmt"
	"github.com/gorilla/mux"
	"io/ioutil"
	"log"
	"net/http"
	"strconv"
)

func Calculater(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type","application/json")

	params := mux.Vars(r)
	oper := params["operation"]


	N1,_  := strconv.Atoi(params["num1"])
	N2,_  := strconv.Atoi(params["num2"])


	if oper=="add" {
		sum := N1 + N2
		json.NewEncoder(w).Encode(sum)
	}else if oper=="sub" {
		sum := N1 - N2
		json.NewEncoder(w).Encode(sum)
	}else if oper=="mul" {
		sum := N1 * N2
		json.NewEncoder(w).Encode(sum)
	}else if oper =="div" {
		sum := N1 / N2
		json.NewEncoder(w).Encode(sum)
	}else{
		log.Println("wrong operation")
		fmt.Fprintf(w, "wrong operation")
	}

}

func Calc(w http.ResponseWriter, r *http.Request)  {
	fmt.Println("reaches api")


	w.Header().Set("Content-Type","application/json")
	CalcStruct := &model.Calculation{}
	body,_ := ioutil.ReadAll(r.Body)

	json.Unmarshal(body,CalcStruct)

	if CalcStruct.Operations=="add" {
		sum := CalcStruct.Num1 + CalcStruct.Num2
		CalcStruct.Total = sum
		json.NewEncoder(w).Encode(CalcStruct)


	}else if CalcStruct.Operations=="sub" {
		sum := CalcStruct.Num1 - CalcStruct.Num2
		CalcStruct.Total = sum
		json.NewEncoder(w).Encode(CalcStruct)

	} else if CalcStruct.Operations=="mul" {
		sum := CalcStruct.Num1 * CalcStruct.Num2
		CalcStruct.Total = sum
		json.NewEncoder(w).Encode(CalcStruct)


	}else if CalcStruct.Operations =="div" {
		sum := CalcStruct.Num1 / CalcStruct.Num2
		CalcStruct.Total = sum
		json.NewEncoder(w).Encode(CalcStruct)

	}else{
		log.Println("wrong operation")
		fmt.Fprintf(w, "wrong operation")

	}


}
