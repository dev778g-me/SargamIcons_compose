package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFlagAlt3: ImageVector
    get() {
        if (_SiFlagAlt3 != null) {
            return _SiFlagAlt3!!
        }
        _SiFlagAlt3 = ImageVector.Builder(
            name = "Filled.SiFlagAlt3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.934f, 2.002f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.773f, 1.705f)
                lineTo(9.162f, 14.251f)
                lineToRelative(2.774f, 7.397f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.873f, 0.704f)
                lineToRelative(-2.992f, -7.98f)
                lineToRelative(-4f, -10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.863f, -1.37f)
                close()
            }
        }.build()

        return _SiFlagAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlagAlt3: ImageVector? = null
