package typingsJapgolly.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Body")
@js.native
open class Body () extends StObject {
  
  /**
    * A `Number` specifying the angle of the body, in radians.
    *
    * @property angle
    * @type {number}
    * @default 0
    */
  var angle: Double = js.native
  
  /**
    * A `Number` that _measures_ the current angular speed of the body after the last `Body.update`. It is read-only and always positive (it's the magnitude of `body.angularVelocity`).
    *
    * @readOnly
    * @property angularSpeed
    * @type {number}
    * @default 0
    */
  val angularSpeed: Double = js.native
  
  /**
    * A `Number` that _measures_ the current angular velocity of the body after the last `Body.update`. It is read-only.
    * If you need to modify a body's angular velocity directly, you should apply a torque or simply change the body's `angle` (as the engine uses position-Verlet integration).
    *
    * @readOnly
    * @property angularVelocity
    * @type {number}
    * @default 0
    */
  val angularVelocity: Double = js.native
  
  /**
    * A `Number` that _measures_ the area of the body's convex hull, calculated at creation by `Body.create`.
    *
    * @property area
    * @type {number}
    * @default
    */
  var area: Double = js.native
  
  /**
    * An array of unique axis vectors (edge normals) used for collision detection.
    * These are automatically calculated from the given convex hull (`vertices` array) in `Body.create`.
    * They are constantly updated by `Body.update` during the simulation.
    *
    * @property axes
    * @type {Vector[]}
    */
  var axes: js.Array[Vector] = js.native
  
  /**
    * A `Bounds` object that defines the AABB region for the body.
    * It is automatically calculated from the given convex hull (`vertices` array) in `Body.create` and constantly updated by `Body.update` during simulation.
    *
    * @property bounds
    * @type {Bounds}
    */
  var bounds: Bounds = js.native
  
  /**
    * A `Number` that is set to the radius of the object if the body was constructed using `Bodies.circle`.
    * May have a value of `null` if the body is no longer a circle (i.e. was scaled with a scaleX != scaleY).
    *
    * @property circleRadius
    * @type {number  | undefined}
    * @default 0
    */
  var circleRadius: js.UndefOr[Double] = js.native
  
  /**
    * An `Object` that specifies the collision filtering properties of this body.
    *
    * Collisions between two bodies will obey the following rules:
    * - If the two bodies have the same non-zero value of `collisionFilter.group`,
    *   they will always collide if the value is positive, and they will never collide
    *   if the value is negative.
    * - If the two bodies have different values of `collisionFilter.group` or if one
    *   (or both) of the bodies has a value of 0, then the category/mask rules apply as follows:
    *
    * Each body belongs to a collision category, given by `collisionFilter.category`. This
    * value is used as a bit field and the category should have only one bit set, meaning that
    * the value of this property is a power of two in the range [1, 2^31]. Thus, there are 32
    * different collision categories available.
    *
    * Each body also defines a collision bitmask, given by `collisionFilter.mask` which specifies
    * the categories it collides with (the value is the bitwise AND value of all these categories).
    *
    * Using the category/mask rules, two bodies `A` and `B` collide if each includes the other's
    * category in its mask, i.e. `(categoryA & maskB) !== 0` and `(categoryB & maskA) !== 0`
    * are both true.
    *
    * @property collisionFilter
    * @type {ICollisionFilter}
    */
  var collisionFilter: ICollisionFilter = js.native
  
  /**
    * A `Number` that defines the density of the body, that is its mass per unit area.
    * If you pass the density via `Body.create` the `mass` property is automatically calculated for you based on the size (area) of the object.
    * This is generally preferable to simply setting mass and allows for more intuitive definition of materials (e.g. rock has a higher density than wood).
    *
    * @property density
    * @type {number}
    * @default 0.001
    */
  var density: Double = js.native
  
  /**
    * A `Vector` that specifies the force to apply in the current step. It is zeroed after every `Body.update`. See also `Body.applyForce`.
    *
    * @property force
    * @type {Vector}
    * @default { x: 0, y: 0 }
    */
  var force: Vector = js.native
  
  /**
    * A `Number` that defines the friction of the body. The value is always positive and is in the range `(0, 1)`.
    * A value of `0` means that the body may slide indefinitely.
    * A value of `1` means the body may come to a stop almost instantly after a force is applied.
    *
    * The effects of the value may be non-linear.
    * High values may be unstable depending on the body.
    * The engine uses a Coulomb friction model including static and kinetic friction.
    * Note that collision response is based on _pairs_ of bodies, and that `friction` values are _combined_ with the following formula:
    *
    *     Math.min(bodyA.friction, bodyB.friction)
    *
    * @property friction
    * @type {number}
    * @default 0.1
    */
  var friction: Double = js.native
  
  /**
    * A `Number` that defines the air friction of the body (air resistance).
    * A value of `0` means the body will never slow as it moves through space.
    * The higher the value, the faster a body slows when moving through space.
    * The effects of the value are non-linear.
    *
    * @property frictionAir
    * @type {number}
    * @default 0.01
    */
  var frictionAir: Double = js.native
  
  /**
    * A `Number` that defines the static friction of the body (in the Coulomb friction model).
    * A value of `0` means the body will never 'stick' when it is nearly stationary and only dynamic `friction` is used.
    * The higher the value (e.g. `10`), the more force it will take to initially get the body moving when nearly stationary.
    * This value is multiplied with the `friction` property to make it easier to change `friction` and maintain an appropriate amount of static friction.
    *
    * @property frictionStatic
    * @type {number}
    * @default 0.5
    */
  var frictionStatic: Double = js.native
  
  /**
    * An integer `Number` uniquely identifying number generated in `Body.create` by `Common.nextId`.
    *
    * @property id
    * @type {number}
    */
  var id: Double = js.native
  
  /**
    * A `Number` that defines the moment of inertia (i.e. second moment of area) of the body.
    * It is automatically calculated from the given convex hull (`vertices` array) and density in `Body.create`.
    * If you modify this value, you must also modify the `body.inverseInertia` property (`1 / inertia`).
    *
    * @property inertia
    * @type {number}
    */
  var inertia: Double = js.native
  
  /**
    * A `Number` that defines the inverse moment of inertia of the body (`1 / inertia`).
    * If you modify this value, you must also modify the `body.inertia` property.
    *
    * @property inverseInertia
    * @type {number}
    */
  var inverseInertia: Double = js.native
  
  /**
    * A `Number` that defines the inverse mass of the body (`1 / mass`).
    * If you modify this value, you must also modify the `body.mass` property.
    *
    * @property inverseMass
    * @type {number}
    */
  var inverseMass: Double = js.native
  
  /**
    * A flag that indicates whether a body is a sensor. Sensor triggers collision events, but doesn't react with colliding body physically.
    *
    * @property isSensor
    * @type {boolean}
    * @default false
    */
  var isSensor: Boolean = js.native
  
  /**
    * A flag that indicates whether the body is considered sleeping. A sleeping body acts similar to a static body, except it is only temporary and can be awoken.
    * If you need to set a body as sleeping, you should use `Sleeping.set` as this requires more than just setting this flag.
    *
    * @property isSleeping
    * @type {boolean}
    * @default false
    */
  var isSleeping: Boolean = js.native
  
  /**
    * A flag that indicates whether a body is considered static. A static body can never change position or angle and is completely fixed.
    * If you need to set a body as static after its creation, you should use `Body.setStatic` as this requires more than just setting this flag.
    *
    * @property isStatic
    * @type {boolean}
    * @default false
    */
  var isStatic: Boolean = js.native
  
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type {string}
    * @default "Body"
    */
  var label: String = js.native
  
  /**
    * A `Number` that defines the mass of the body, although it may be more appropriate to specify the `density` property instead.
    * If you modify this value, you must also modify the `body.inverseMass` property (`1 / mass`).
    *
    * @property mass
    * @type {number}
    */
  var mass: Double = js.native
  
  /**
    * A `Number` that _measures_ the amount of movement a body currently has (a combination of `speed` and `angularSpeed`). It is read-only and always positive.
    * It is used and updated by the `Matter.Sleeping` module during simulation to decide if a body has come to rest.
    *
    * @readOnly
    * @property motion
    * @type {number}
    * @default 0
    */
  val motion: Double = js.native
  
  /**
    * A self reference if the body is _not_ a part of another body.
    * Otherwise this is a reference to the body that this is a part of.
    * See `body.parts`.
    *
    * @property parent
    * @type {Body}
    */
  var parent: Body = js.native
  
  /**
    * An array of bodies that make up this body.
    * The first body in the array must always be a self reference to the current body instance.
    * All bodies in the `parts` array together form a single rigid compound body.
    * Parts are allowed to overlap, have gaps or holes or even form concave bodies.
    * Parts themselves should never be added to a `World`, only the parent body should be.
    * Use `Body.setParts` when setting parts to ensure correct updates of all properties.
    *
    * @property parts
    * @type {Body[]}
    */
  var parts: js.Array[Body] = js.native
  
  /**
    * An object reserved for storing plugin-specific properties.
    *
    * @property plugin
    */
  var plugin: Any = js.native
  
  /**
    * A `Vector` that specifies the current world-space position of the body.
    *
    * @property position
    * @type {Vector}
    * @default { x: 0, y: 0 }
    */
  var position: Vector = js.native
  
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type {any}
    */
  var render: IBodyRenderOptions = js.native
  
  /**
    * A `Number` that defines the restitution (elasticity) of the body. The value is always positive and is in the range `(0, 1)`.
    * A value of `0` means collisions may be perfectly inelastic and no bouncing may occur.
    * A value of `0.8` means the body may bounce back with approximately 80% of its kinetic energy.
    * Note that collision response is based on _pairs_ of bodies, and that `restitution` values are _combined_ with the following formula:
    *
    *     Math.max(bodyA.restitution, bodyB.restitution)
    *
    * @property restitution
    * @type {number}
    * @default 0
    */
  var restitution: Double = js.native
  
  /**
    * A `Number` that defines the number of updates in which this body must have near-zero velocity before it is set as sleeping by the `Matter.Sleeping` module (if sleeping is enabled by the engine).
    *
    * @property sleepThreshold
    * @type {number}
    * @default 60
    */
  var sleepThreshold: Double = js.native
  
  /**
    * A `Number` that specifies a tolerance on how far a body is allowed to 'sink' or rotate into other bodies.
    * Avoid changing this value unless you understand the purpose of `slop` in physics engines.
    * The default should generally suffice, although very large bodies may require larger values for stable stacking.
    *
    * @property slop
    * @type {number}
    * @default 0.05
    */
  var slop: Double = js.native
  
  /**
    * A `Number` that _measures_ the current speed of the body after the last `Body.update`. It is read-only and always positive (it's the magnitude of `body.velocity`).
    *
    * @readOnly
    * @property speed
    * @type {number}
    * @default 0
    */
  val speed: Double = js.native
  
  /**
    * A `Number` that allows per-body time scaling, e.g. a force-field where bodies inside are in slow-motion, while others are at full speed.
    *
    * @property timeScale
    * @type {number}
    * @default 1
    */
  var timeScale: Double = js.native
  
  /**
    * A `Number` that specifies the torque (turning force) to apply in the current step. It is zeroed after every `Body.update`.
    *
    * @property torque
    * @type {number}
    * @default 0
    */
  var torque: Double = js.native
  
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type {string}
    * @default "body"
    */
  var `type`: String = js.native
  
  /**
    * A `Vector` that _measures_ the current velocity of the body after the last `Body.update`. It is read-only.
    * If you need to modify a body's velocity directly, you should either apply a force or simply change the body's `position` (as the engine uses position-Verlet integration).
    *
    * @readOnly
    * @property velocity
    * @type {Vector}
    * @default { x: 0, y: 0 }
    */
  val velocity: Vector = js.native
  
  /**
    * An array of `Vector` objects that specify the convex hull of the rigid body.
    * These should be provided about the origin `(0, 0)`. E.g.
    *
    *     [{ x: 0, y: 0 }, { x: 25, y: 50 }, { x: 50, y: 0 }]
    *
    * When passed via `Body.create`, the vertices are translated relative to `body.position` (i.e. world-space, and constantly updated by `Body.update` during simulation).
    * The `Vector` objects are also augmented with additional properties required for efficient collision detection.
    *
    * Other properties such as `inertia` and `bounds` are automatically calculated from the passed vertices (unless provided via `options`).
    * Concave hulls are not currently supported. The module `Matter.Vertices` contains useful methods for working with vertices.
    *
    * @property vertices
    * @type {Vector[]}
    */
  var vertices: js.Array[Vector] = js.native
}
/* static members */
object Body {
  
  @JSImport("matter-js", "Body")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Applies a force to a body from a given world-space position, including resulting torque.
    * @method applyForce
    * @param {Body} body
    * @param {Vector} position
    * @param {Vector} force
    */
  inline def applyForce(body: Body, position: Vector, force: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyForce")(body.asInstanceOf[js.Any], position.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Creates a new rigid body model. The options parameter is an object that specifies any properties you wish to override the defaults.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @returns {Body} body
    */
  inline def create(options: IBodyDefinition): Body = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Body]
  
  /**
    * Returns the next unique category bitfield (starting after the initial default category `0x0001`).
    * There are 32 available. See `body.collisionFilter` for more information.
    * @method nextCategory
    * @returns {Number} Unique category bitfield
    */
  inline def nextCategory(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextCategory")().asInstanceOf[Double]
  
  /**
    * Returns the next unique group index for which bodies will collide.
    * If `isNonColliding` is `true`, returns the next unique group index for which bodies will _not_ collide.
    * See `body.collisionFilter` for more information.
    * @method nextGroup
    * @param {boolean} [isNonColliding=false]
    * @returns {Number} Unique group index
    */
  inline def nextGroup(isNonColliding: Boolean): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nextGroup")(isNonColliding.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Rotates a body by a given angle relative to its current angle, without imparting any angular velocity.
    * @method rotate
    * @param {Body} body
    * @param {number} rotation
    */
  inline def rotate(body: Body, rotation: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(body.asInstanceOf[js.Any], rotation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Scales the body, including updating physical properties (mass, area, axes, inertia), from a world-space point (default is body centre).
    * @method scale
    * @param {Body} body
    * @param {number} scaleX
    * @param {number} scaleY
    * @param {Vector} [point]
    */
  inline def scale(body: Body, scaleX: Double, scaleY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(body.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scale(body: Body, scaleX: Double, scaleY: Double, point: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(body.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Given a property and a value (or map of), sets the property(s) on the body, using the appropriate setter functions if they exist.
    * Prefer to use the actual setter functions in performance critical situations.
    * @method set
    * @param {Body} body
    * @param {} settings A property name (or map of properties and values) to set on the body.
    * @param {} value The value to set if `settings` is a single property name.
    */
  inline def set(body: Body, settings: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def set(body: Body, settings: Any, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(body.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the angle of the body instantly. Angular velocity, position, force etc. are unchanged.
    * @method setAngle
    * @param {Body} body
    * @param {number} angle
    */
  inline def setAngle(body: Body, angle: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAngle")(body.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the angular velocity of the body instantly. Position, angle, force etc. are unchanged. See also `Body.applyForce`.
    * @method setAngularVelocity
    * @param {Body} body
    * @param {number} velocity
    */
  inline def setAngularVelocity(body: Body, velocity: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAngularVelocity")(body.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Set the centre of mass of the body.
    * The `centre` is a vector in world-space unless `relative` is set, in which case it is a translation.
    * The centre of mass is the point the body rotates about and can be used to simulate non-uniform density.
    * This is equal to moving `body.position` but not the `body.vertices`.
    * Invalid if the `centre` falls outside the body's convex hull.
    * @method setCentre
    * @param body
    * @param centre
    * @param relative
    */
  inline def setCentre(body: Body, centre: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCentre")(body.asInstanceOf[js.Any], centre.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCentre(body: Body, centre: Vector, relative: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCentre")(body.asInstanceOf[js.Any], centre.asInstanceOf[js.Any], relative.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the density of the body. Mass is automatically updated to reflect the change.
    * @method setDensity
    * @param {Body} body
    * @param {number} density
    */
  inline def setDensity(body: Body, density: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDensity")(body.asInstanceOf[js.Any], density.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the moment of inertia (i.e. second moment of area) of the body of the body.
    * Inverse inertia is automatically updated to reflect the change. Mass is not changed.
    * @method setInertia
    * @param {Body} body
    * @param {number} inertia
    */
  inline def setInertia(body: Body, interna: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInertia")(body.asInstanceOf[js.Any], interna.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the mass of the body. Inverse mass and density are automatically updated to reflect the change.
    * @method setMass
    * @param {Body} body
    * @param {number} mass
    */
  inline def setMass(body: Body, mass: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMass")(body.asInstanceOf[js.Any], mass.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the parts of the `body` and updates mass, inertia and centroid.
    * Each part will have its parent set to `body`.
    * By default the convex hull will be automatically computed and set on `body`, unless `autoHull` is set to `false.`
    * Note that this method will ensure that the first part in `body.parts` will always be the `body`.
    * @method setParts
    * @param {Body} body
    * @param [body] parts
    * @param {boolean} [autoHull=true]
    */
  inline def setParts(body: Body, parts: js.Array[Body]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParts")(body.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setParts(body: Body, parts: js.Array[Body], autoHull: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setParts")(body.asInstanceOf[js.Any], parts.asInstanceOf[js.Any], autoHull.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the position of the body instantly. Velocity, angle, force etc. are unchanged.
    * @method setPosition
    * @param {Body} body
    * @param {Vector} position
    */
  inline def setPosition(body: Body, position: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setPosition")(body.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the body as static, including isStatic flag and setting mass and inertia to Infinity.
    * @method setStatic
    * @param {Body} body
    * @param {boolean} isStatic
    */
  inline def setStatic(body: Body, isStatic: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStatic")(body.asInstanceOf[js.Any], isStatic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the linear velocity of the body instantly. Position, angle, force etc. are unchanged. See also `Body.applyForce`.
    * @method setVelocity
    * @param {Body} body
    * @param {Vector} velocity
    */
  inline def setVelocity(body: Body, velocity: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVelocity")(body.asInstanceOf[js.Any], velocity.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Sets the body's vertices and updates body properties accordingly, including inertia, area and mass (with respect to `body.density`).
    * Vertices will be automatically transformed to be orientated around their centre of mass as the origin.
    * They are then automatically translated to world space based on `body.position`.
    *
    * The `vertices` argument should be passed as an array of `Matter.Vector` points (or a `Matter.Vertices` array).
    * Vertices must form a convex hull, concave hulls are not supported.
    *
    * @method setVertices
    * @param {Body} body
    * @param {Vector[]} vertices
    */
  inline def setVertices(body: Body, vertices: js.Array[Vector]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVertices")(body.asInstanceOf[js.Any], vertices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Moves a body by a given vector relative to its current position, without imparting any velocity.
    * @method translate
    * @param {Body} body
    * @param {Vector} translation
    */
  inline def translate(body: Body, translation: Vector): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(body.asInstanceOf[js.Any], translation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Performs a simulation step for the given `body`, including updating position and angle using Verlet integration.
    * @method update
    * @param {Body} body
    * @param {number} deltaTime
    * @param {number} timeScale
    * @param {number} correction
    */
  inline def update(body: Body, deltaTime: Double, timeScale: Double, correction: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(body.asInstanceOf[js.Any], deltaTime.asInstanceOf[js.Any], timeScale.asInstanceOf[js.Any], correction.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
