// fix me - stolen from another project

var duckForm = document.querySelector("#duckForm")
setInterval(getducks, 500)
duckForm.addEventListener('keyup', (e) => {
	if (e.keyCode === 13) {
		let duck = {
				"text": duckForm.value,
				"user": user,
				"createdDate": new Date()
		}
		let duckText = duckForm.value
		console.log(`Send duck ${duckText}`)
		duckForm.value = ''
		fetch('/ducks', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json; charset=utf-8'
			},
			body: JSON.stringify(duck)
		}).then(response => {getducks()})
		return false
	}
})

function getducks () {
	let duckContainer = document.querySelector(".duck-container")
	fetch(`/ducks/${cuckId}`)
	.then(response => response.json())
	.then(ducks => {
		duckContainer.innerHTML = ''
		ducks.forEach(duck => {
			duckContainer.innerHTML += `<div>
			  <span class="timestamp">${duck.user.name}: </span>
		  	  <span class="duck">${duck.text}</span>
			</div>`
		})
	})
}