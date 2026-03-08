package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPlay: ImageVector
    get() {
        if (_SiPlay != null) {
            return _SiPlay!!
        }
        _SiPlay = ImageVector.Builder(
            name = "Filled.SiPlay",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.192f, 3.67f)
                lineToRelative(13.568f, 7.633f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.394f)
                lineTo(6.192f, 20.33f)
                arcTo(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19.632f)
                verticalLineTo(4.368f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.192f, -0.697f)
            }
        }.build()

        return _SiPlay!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlay: ImageVector? = null
