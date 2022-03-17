/***
 * 
 * our JS-based app needs to make two requests to an external API to fetch two sets of data: customers and orders. Due to how you'll need to use this data, a good strategy is to match and merge the two lists into one: a list of customers where each item can have a nested list of orders.

Build a denormalize function which takes in two arrays and the reference ID (foreign key), the first one being the primary type (in this case denormalize(customers, orders, 'customerId')), and returns a new array with the nested structure described above.
 * 
 * 
 */

function denormalize({ primary, related, relatedName, referenceId }) {
    
    let resul = primary.map(obj=>{
        let orders=related.filter(x=> x. customerId === obj.id);
        return obj = {...obj, orders : orders}
    })
     
   return resul;
 }
 
 module.exports = denormalize;