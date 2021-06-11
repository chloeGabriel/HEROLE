//AUTHORIZATION HEADER = check inside LocalStorage for 'user' item

export default function authHeader() {
    let user = JSON.parse(localStorage.getItem('user'));

    if (user && user.accesToken) {
        return {Authorization: 'Bearer' + user.accesToken };
    } else {
        return {};
    }
}