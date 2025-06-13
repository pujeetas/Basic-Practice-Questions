//object destructuring
const employee = {
  id: 101,
  personalInfo: {
    name: "John",
    contact: {
      email: "john@example.com",
      phone: {
        mobile: "123-456-7890",
        office: "987-654-3210"
      }
    }
  },
  department: "Engineering"
};

const {personalInfo:{contact:{phone: {mobile}}, name}, department} = employee;
console.log(`${name} from ${department} can be reached at ${mobile}`);

//array destructuring
const colors = ["red", "green", "blue", "yellow"];

const[color1,,,color2, ...rest] = colors;
