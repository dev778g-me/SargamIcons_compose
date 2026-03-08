package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiNorthWest: ImageVector
    get() {
        if (_SiNorthWest != null) {
            return _SiNorthWest!!
        }
        _SiNorthWest = ImageVector.Builder(
            name = "Duotone.SiNorthWest",
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
                moveTo(16f, 16f)
                lineTo(8f, 8f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(5f)
                moveToRelative(0f, -5f)
                horizontalLineToRelative(5f)
            }
        }.build()

        return _SiNorthWest!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthWest: ImageVector? = null
