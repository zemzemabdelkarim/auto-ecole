async function fetchData() {
    const response = await fetch('/getHours');
    const data = await response.json();
    const list = document.getElementById('hoursList');
    list.innerHTML = ''; // Clear existing content
    data.forEach(item => {
        const li = document.createElement('li');
        const div1 = document.createElement("div");
        const div2 = document.createElement("div");
        div1.setAttribute("class", "info");
        div2.setAttribute("class", "info");

        const pDescriptionHourId = document.createElement("p");
        pDescriptionHourId.setAttribute("class", "description");
        pDescriptionHourId.textContent = "hourId : ";

        const pDescriptionCandidateId = document.createElement("p");
        pDescriptionCandidateId.setAttribute("class", "description");
        pDescriptionCandidateId.textContent = "candidateId :";

        const pValueHourId = document.createElement("p");
        pValueHourId.setAttribute("class", "value");
        pValueHourId.textContent = item.hourId;

        const pValueCandidateId = document.createElement("p");
        pValueCandidateId.setAttribute("class", "value");
        pValueCandidateId.textContent = item.candidateId;

        //div1.textContent = "hour id : "+item.hourId;
        //div2.textContent = "candidate : "+item.candidateId;
        div1.appendChild(pDescriptionHourId); div1.appendChild(pValueHourId);
        div2.appendChild(pDescriptionCandidateId); div2.appendChild(pValueCandidateId);

        li.setAttribute("class","hourItem");
        li.setAttribute("id", "hour_"+item.hourId);

        li.appendChild(div1);li.appendChild(div2);
        list.appendChild(li);
    });
}

window.onload = fetchData;
