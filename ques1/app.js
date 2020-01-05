class Weather {
  constructor() {
    this.apiKey = '1abc953f30a5a9726c5c068bb319151a';
  }
  async getWeather(city) 
  {
    const response = await fetch(`http://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${this.apiKey}&units=metric`)
    const responseData = await response.json();
	console.log(responseData);
    return responseData;
  }
};
const weather = new Weather();

function codeAddress() 
{			var j=0;

	var cities=['coimbatore','chennai','mumbai','delhi','kolkata','bangalore','hyderabad','madurai','ooty','shimla'];
	for(var i=0;i<cities.length;i++)
	{
		weather.getWeather(cities[i]).
		then(results => {
			document.getElementById("location"+j).innerHTML=results.name;
			document.getElementById("temp"+j).innerHTML=results.main.temp 
			document.getElementById("desc"+j).innerHTML=results.weather[0].main;
			document.getElementById("url"+j).href = "detailview.html?city="+results.name;

			j++;
		})
		.catch(err => console.log(err));
	}
}
window.onload = codeAddress;