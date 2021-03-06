export default class Utils {
    static isValidField = (value) => {
        //value.trim().length > 0 ? response = true : response = false;
        return value.trim().length > 0;
    }

    static isValidEmail = (email) => {
        //return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);


        const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(String(email).toLocaleLowerCase());


    }
}