package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiHeartAlt: ImageVector
    get() {
        if (_SiHeartAlt != null) {
            return _SiHeartAlt!!
        }
        _SiHeartAlt = ImageVector.Builder(
            name = "Filled.SiHeartAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.519f, 2f)
                arcTo(6.452f, 6.452f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.98f, 13.104f)
                lineToRelative(0.639f, 0.645f)
                lineToRelative(0.863f, 0.857f)
                lineToRelative(0.003f, 0.003f)
                lineToRelative(6.85f, 6.85f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.413f, 0f)
                lineToRelative(6.85f, -6.85f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(0.858f, -0.852f)
                lineToRelative(0.65f, -0.657f)
                lineToRelative(0.002f, -0.002f)
                arcToRelative(6.452f, 6.452f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.068f, -9.177f)
                arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, 2f)
            }
        }.build()

        return _SiHeartAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiHeartAlt: ImageVector? = null
