package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiNortheastSouthwest: ImageVector
    get() {
        if (_SiNortheastSouthwest != null) {
            return _SiNortheastSouthwest!!
        }
        _SiNortheastSouthwest = ImageVector.Builder(
            name = "Duotone.SiNortheastSouthwest",
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
                moveTo(18.364f, 5.636f)
                lineTo(5.636f, 18.364f)
                moveTo(18.364f, 5.636f)
                horizontalLineToRelative(-5.657f)
                moveToRelative(5.657f, 0f)
                verticalLineToRelative(5.657f)
                moveToRelative(-12.728f, 7.07f)
                verticalLineToRelative(-5.656f)
                moveToRelative(0f, 5.657f)
                horizontalLineToRelative(5.657f)
            }
        }.build()

        return _SiNortheastSouthwest!!
    }

@Suppress("ObjectPropertyName")
private var _SiNortheastSouthwest: ImageVector? = null
