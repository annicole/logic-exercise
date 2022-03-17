
/***
 * Problema 1 
 * 
 * create an object with a hello method that writes Hello <name> in the console.
 * 
 * 
 */

const p ={
    name:'Nicole',
    hello : () => console.log(`Hello ${p.name}`)
}

p.hello();


/**
 * how would you make the name immutable?
 */

Object.freeze(p);
p.name ='otro';
p.hello();

/**
 * write a function that logs the 5 cities that occur the most in the array beññpw in order
 * from the most number of occurences to least
 */


const citiesList=[

    "nashville",
    "nashville",
    "madrid",
    "barcelona",
    "london"
];

function logMostOcurrance(numCities){
    const cities = {}

    citiesList.forEach(city =>{
        cities[city] = !cities[city] ? 1 : cities[city] +=1;
    });

    return Object.keys(cities)
    .map(city=> ({name:city, times: cities[city]}))
    .sort((a,b)=> b.times - a.times)
    .slice(0,numCities)
    .map(obj=> obj.name);
}