package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUserAlt: ImageVector
    get() {
        if (_SiUserAlt != null) {
            return _SiUserAlt!!
        }
        _SiUserAlt = ImageVector.Builder(
            name = "Filled.SiUserAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 8.5f)
                curveToRelative(0f, 2.75f, 2.25f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.25f, 5f, -5f)
                verticalLineTo(7f)
                curveToRelative(0f, -2.75f, -2.25f, -5f, -5f, -5f)
                reflectiveCurveTo(7f, 4.25f, 7f, 7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 20.4f)
                curveToRelative(0f, 0.88f, 0.72f, 1.6f, 1.6f, 1.6f)
                horizontalLineToRelative(16.78f)
                curveToRelative(0.88f, 0f, 1.6f, -0.72f, 1.6f, -1.6f)
                verticalLineToRelative(-4.65f)
                curveToRelative(0f, -0.24f, 0f, -0.5f, -0.12f, -0.62f)
                curveToRelative(-0.37f, -0.87f, -1.5f, -1.63f, -3.25f, -2.25f)
                curveToRelative(-1.24f, 2.38f, -3.75f, 4f, -6.62f, 4f)
                reflectiveCurveToRelative(-5.37f, -1.62f, -6.62f, -4f)
                curveToRelative(-1.75f, 0.63f, -2.87f, 1.37f, -3.25f, 2.25f)
                curveToRelative(-0.12f, 0.24f, -0.12f, 0.37f, -0.12f, 0.62f)
                close()
            }
        }.build()

        return _SiUserAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt: ImageVector? = null
