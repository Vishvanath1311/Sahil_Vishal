// function add(a=10,b=10)// these are the default value which are defined by us
// {
//     return result = a+b
// }
// console.log(add())
// console.log(add(10))
// console.log(add(10,20))
// console.log(add(10,50,50))
// console.log(add(-10,-59))



function total(...nums){
let sum=0
for(i=0; i<nums.length; i++)
{
sum=sum+nums[i]
}
return sum
}
 console.log("atharva", "is" ,"very", "clever ")

function total(...nums)
{
    let sum =0
    for(let i=0;i<nums.length;i++)
    {
        sum=sum+nums[i]
    }
    return sum
}

console.log(total(1,2,3,4,5,6))

console.log(total( "hi","how r you","go to hell","goodbye"))

