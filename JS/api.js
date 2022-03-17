
getData = async () =>{

    const response = await fetch("http://dummy.restapiexample.com/api/v1/employees",{
        method:'GET',
        headers:{
            "Contet-type":"application/json"
        }
    });

    const data = await response.json();
    let employees = data.data;

    employees.forEach(element => {
        console.log('employee name ' , element.employee_name);
    });
}