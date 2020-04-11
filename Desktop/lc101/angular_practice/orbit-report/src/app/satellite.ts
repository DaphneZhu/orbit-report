export class Satellite {
    name: string;
    orbitType: string;
    type: string;
    operational: boolean;
    launchDate: string;
    showWarning: boolean; 

    constructor(name: string, type: string, launchDate: string, orbitType: string, operational: boolean){
        this.name = name;
        this.type = type;
        this.launchDate = launchDate;
        this.orbitType = orbitType;
        this.operational = operational; 
    }   
    
    shouldShowWarning () {
        if (this.type.toUpperCase === "Space Debris".toUpperCase) {
            this.showWarning = true; 
        }
        else {
            this.showWarning = false; 
        }
        console.log(this.type);
        return this.showWarning;
    }
}

