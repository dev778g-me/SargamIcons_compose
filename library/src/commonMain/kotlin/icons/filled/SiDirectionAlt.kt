package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDirectionAlt: ImageVector
    get() {
        if (_SiDirectionAlt != null) {
            return _SiDirectionAlt!!
        }
        _SiDirectionAlt = ImageVector.Builder(
            name = "Filled.SiDirectionAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, -0.208f)
                lineToRelative(18f, 7.92f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.15f, 1.883f)
                lineToRelative(-7.421f, 1.944f)
                lineToRelative(-1.944f, 7.422f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.883f, 0.148f)
                lineToRelative(-7.92f, -18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.208f, -1.11f)
            }
        }.build()

        return _SiDirectionAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiDirectionAlt: ImageVector? = null
