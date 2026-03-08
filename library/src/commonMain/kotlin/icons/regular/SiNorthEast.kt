package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiNorthEast: ImageVector
    get() {
        if (_SiNorthEast != null) {
            return _SiNorthEast!!
        }
        _SiNorthEast = ImageVector.Builder(
            name = "Regular.SiNorthEast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(8f, 16f)
                lineToRelative(8f, -8f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(5f)
                moveToRelative(0f, -5f)
                horizontalLineToRelative(-5f)
            }
        }.build()

        return _SiNorthEast!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthEast: ImageVector? = null
