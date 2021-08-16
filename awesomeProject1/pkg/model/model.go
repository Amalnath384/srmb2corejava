package model


type Calculation struct {
	Operations string `json:"operations"`
	Num1 int `json:"num1"`
	Num2 int `json:"num2"`
	Total int `json:"total"`
}
