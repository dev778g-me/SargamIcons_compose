package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCode: ImageVector
    get() {
        if (_SiCode != null) {
            return _SiCode!!
        }
        _SiCode = ImageVector.Builder(
            name = "Duotone.SiCode",
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
                moveToRelative(8f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
                moveToRelative(8f, 0f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
            }
        }.build()

        return _SiCode!!
    }

@Suppress("ObjectPropertyName")
private var _SiCode: ImageVector? = null
