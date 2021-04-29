package com.example.danie.ppd_final_project;



// interface which defends a physics component to be used by gameobjects (if they require it)
    // right now, there is only a dynamic physics component which implements this interface
public interface PhysicsComponent {
    void update(GameObject gameObject);
}
