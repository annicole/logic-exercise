/**
* Obtener todos los Viernes 13 que han ocurrido en un rango de años.
* La función debe regresar un arreglo de fechas con el siguiente formato: AAAA/3 primeras letras del mes/DD
*/

const getFridays13 = (start, end) => {

	let year = start;
  let arrayDates=[];
 
  const months = ['Ene','Feb','Mar','Abr','May','Jun','Jul','Ago','Sep','Oct','Nov','Dic'];
  while(year<= end){
  	for(let month=0;month<=11;month++){
    		const day = new Date(year,month,13).getDay();
        if(day===5){
          const fridayT = `${year}/${months[month]}/13`;
           arrayDates.push(fridayT);
        }
    }
    year++;
  }
  return arrayDates;

}

console.clear()
console.log(getFridays13(2020, 2022)) // ['2020/Mar/13', '2020/Nov/13', '2021/Ago/13', '2022/May/13']
console.log(getFridays13(2000, 2002)) // ['2000/Oct/13', '2001/Abr/13', '2001/Jul/13', '2002/Sep/13', '2002/Dic/13']
console.log(getFridays13(1995, 1997)) // ['1995/Ene/13', '1995/Oct/13', '1996/Sep/13', '1996/Dic/13', '1997/Jun/13']
