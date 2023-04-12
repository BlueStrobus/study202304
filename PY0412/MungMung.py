# import pynecone as pc
# import requests

# class State(pc.State):
#     image_url: str
#     fetching = False

#     def start_fetching(self):
#         self.fetching = True

#     def fetch_dog(self):
#         response = requests.get("https://dog.ceo/api/breeda/image/random")
#         json = response.json()
#         self.image_url = json["message"]
#         self.fetching = False

#     def index():
#         return pc.vstack(
#             pc.heading(
#             "DOg vuewer",
#             size="3x1",

#             ),
#             pc.button("Give me a dog!", on_click=[State.start_fetching, State.fetch_dog]),
#             pc.cond(
#                 State.fetching
#                 pc.circular_progress(is_indeterminate=True),             
#             ),
#             pc.cond(
#                 State.image_url !="",
#                 pc.image(
#                     src=State.image_url, 
#                     height="25em",
#                     width="25em",
#                 )
#             )
#         )

import pynecone as pc
import requests

class State(pc.State):
    image_url: str = ""
    fetching: bool = False

    def start_fetching(self):
        self.fetching = True

    def fetch_dog(self):
        response = requests.get("https://dog.ceo/api/breeds/image/random")
        json = response.json()
        self.image_url = json["message"]
        self.fetching = False

def index():
    state = State()
    return pc.Page(
        pc.Heading(
            "Dog Viewer",
            size="3x1",
        ),
        pc.Button("Give me a dog!", on_click=[state.start_fetching, state.fetch_dog]),
        pc.Cond(
            state.fetching,
            pc.CircularProgress(is_indeterminate=True),
        ),
        pc.Cond(
            state.image_url != "",
            pc.Image(
                src=state.image_url, 
                height="25em",
                width="25em",
            ),
        ),
    )
#실패
# pc.run(index)
