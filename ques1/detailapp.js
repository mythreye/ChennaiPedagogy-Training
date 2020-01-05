class Weather {
  constructor() {
    this.apiKey = '1abc953f30a5a9726c5c068bb319151a';
    this.location = document.getElementById('w-location');
    this.desc = document.getElementById('w-desc');
	this.string = document.getElementById('w-string');
    this.string1 = document.getElementById('w-string1');
	this.string2 = document.getElementById('w-string2');
	this.string3 = document.getElementById('w-string3');
	this.string4 = document.getElementById('w-string4');
	this.string6 = document.getElementById('w-string6');

    this.details = document.getElementById('w-details');
    this.icon = document.getElementById('w-icon');
    this.humidity = document.getElementById('w-humidity');
    this.wind = document.getElementById('w-wind');
  }
  paint(weather) {
    this.location.textContent = weather.name;
    this.desc.textContent = weather.weather[0].main;
    this.string.textContent = "TEMP:"+weather.main.temp + "℃";
	this.string1.textContent ="Feels Like:"+ weather.main.feels_like + "℃";
    this.string2.textContent = "Min TEMP:"+weather.main.temp_min + "℃";
    this.string3.textContent = "Max TEMP:"+weather.main.temp_max + "℃";
    this.string4.textContent = "Preasure:"+weather.main.pressure + "℃";
	this.string6.textContent = "Logitude:"+weather.coord.lon +"Latitude:"+weather.coord.lat;
    this.icon.setAttribute('src', `http://openweathermap.org/img/w/${weather.weather[0].icon}.png`)
    this.humidity.textContent = `Relative Humidity: ${weather.main.humidity} %`;
    this.wind.textContent = `Wind: ${weather.wind.speed} m/s`;
  }
   async getWeather(city) {
    const response = await fetch(`http://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${this.apiKey}&units=metric`)
    const responseData = await response.json();
	console.log(responseData);
    return responseData;
  }
};
const weather = new Weather();

function codeAddress() 
{
var searchString = window.location.search.substring(6);
weather.getWeather(searchString).
		then(results => {
			weather.paint(results);
			}
		)
		.catch(err => console.log(err));
	}
window.onload = codeAddress;

